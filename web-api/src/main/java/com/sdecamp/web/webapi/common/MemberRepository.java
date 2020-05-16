package com.sdecamp.web.webapi.common;

import com.sdecamp.web.webapi.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
