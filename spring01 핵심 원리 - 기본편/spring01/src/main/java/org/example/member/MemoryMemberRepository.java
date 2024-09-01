package org.example.member;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<Long,Member>();


    @Override
    public void save(org.example.member.Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public org.example.member.Member findById(Long memberId) {
        return store.get(memberId);
    }
}
