package uk.gergely.kiss.app;

import org.springframework.data.repository.CrudRepository;

public interface UserVORepository extends CrudRepository<UserVO, Integer> {
}
