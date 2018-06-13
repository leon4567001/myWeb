package action;

import com.opensymphony.xwork2.ModelDriven;

import hibernate.UsersEntity;
import service.UserDAO;
import service.impl.UserDAOImpl;


public class UserAction extends SuperAction implements ModelDriven<UsersEntity> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private UsersEntity user =new UsersEntity();//模型驱动方式可以不用getset方法封装


    //用户登陆动作
    public String sysLogin(){
        UserDAO udao = new UserDAOImpl();
        if(udao.usersLongin(user)){
            return "Login_Success";
        }else{
            return "Login_Failure";
        }
    }
    @Override
    public UsersEntity getModel() {
        // TODO Auto-generated method stub
        return this.user;
    }

}
