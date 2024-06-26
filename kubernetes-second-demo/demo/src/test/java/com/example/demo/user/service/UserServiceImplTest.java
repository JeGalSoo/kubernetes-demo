//package com.example.demo.user.service;
//
//import com.example.demo.common.component.Messenger;
//import com.example.demo.user.model.User;
//import com.example.demo.user.model.UserDto;
//import com.example.demo.user.repository.UserRepository;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class UserServiceImplTest {
//
//    private UserService service;
//    @Mock
//    private UserRepository repository;
//    @BeforeEach
//    void setup() {
//        this.service = new UserServiceImpl(repository);
//    }
//    @Test
//    public void 사용자_저장()throws Exception {
//
//        Optional<User> user = Optional.of(User.builder().id(1L).name("홍길동").build());
//        //when(repository.save(user)).thenReturn(user);
//        // assertThat(service.count().getMessage()).isEqualTo("0");
//        // assertThat(service.findById(1L).get().getName()).isEqualTo("홍길동");
//        // verify(repository, times(1)).findById(1L);
//        // verify(repository, never()).findAll();
//        // verifyNoInteractions(repository);
//    }
//    @Test
//    public void 사용자_검색()throws Exception {
//
//        Optional<User> user = Optional.of(User.builder().id(1L).name("홍길동").build());
//        when(repository.findById(anyLong())).thenReturn(user);
//        assertThat(service.findById(1L).get().getName()).isEqualTo("홍길동");
//        // verify(repository, times(1)).findById(1L);
//        // verify(repository, never()).findAll();
//        // verifyNoInteractions(repository);
//    }
//    @Test
//    public void 사용자_전체_검색()throws Exception {
//
//        List<User> users = getList();
//        BDDMockito.given(repository.findAll()).willReturn(users);
//        List<UserDto> list = service.findAll();
//        assertThat(list.size())
//                .isEqualTo(3);
//
//        // verify(repository, times(1)).findById(1L);
//        // verify(repository, never()).findAll();
//        // verifyNoInteractions(repository);
//    }
//
//    private List<User> getList() {
//        return Arrays.asList(
//                User.builder().id(1L).username("yoo").name("유관순").build(),
//                User.builder().id(2L).username("kim").name("김구").build(),
//                User.builder().id(3L).username("lee").name("이화림").build()
//        );
//    }
//}