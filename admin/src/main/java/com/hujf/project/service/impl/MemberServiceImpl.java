package com.hujf.project.service.impl;

import com.hujf.project.common.exception.ApiException;
import com.hujf.project.common.util.UUIDUtil;
import com.hujf.project.mapper.SmUserMapper;
import com.hujf.project.model.SmUser;
import com.hujf.project.model.SmUserExample;
import com.hujf.project.service.MemberService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author Hujf
 * @title: MemberServiceIm
 * @date 2020/10/10 0010下午 5:36
 * @description: 用户服务接口实现类
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private SmUserMapper smUserMapper;

    @Override
    public void register(String username, String password, String telephone, String authCode) {
        //1.查询是否有这个用户。
        SmUserExample smUserExample = new SmUserExample();
        smUserExample.createCriteria().andUserNameEqualTo(username);
        smUserExample.or(smUserExample.createCriteria().andUserPhoneEqualTo(telephone));
        List<SmUser> smUserList = smUserMapper.selectByExample(smUserExample);
        if(!smUserList.isEmpty()){
            throw new ApiException("用户已存在");
        }

        SmUser smUser = new SmUser();
        smUser.setUserPk(UUIDUtil.getUUid());
        smUser.setUserName(username);
        smUser.setUserPassword(password);
        smUser.setCreateTime(new Date());
        smUser.setCreator(username);
        smUser.setStatus(1);
        smUser.setUserPhone(telephone);
        //获取当前最后一个
        Integer id =smUserMapper.getLastId();
        if( id==null){
            smUser.setUserId(1);
        }else{
            smUser.setUserId(id+1);
        }

        smUserMapper.insertSelective(smUser);

    }
}
