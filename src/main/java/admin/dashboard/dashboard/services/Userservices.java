package admin.dashboard.dashboard.services;
import admin.dashboard.dashboard.entity.User;
import admin.dashboard.dashboard.repository.Userepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Userservices{

        @Autowired
        private Userepository userepository;


        public void register(User user) {

            userepository.save(user);
        }

    public  List<User> getAllUsers() {

            return userepository.findAll();
    }
        // Get all users waiting for approval
        public List<User> getPendingUsers() {
            return userepository.findAll().stream().filter(user -> !user.isApproved()).toList();
        }

        // Approve a user
        public void approveUser(Integer userId) {
            userepository.findById(userId).ifPresent(user -> {
                user.setApproved(true);
                userepository.save(user);
            });
        }

    }

