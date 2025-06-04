package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    // 추가학습 : HashMap vs concructHashMap(동시성 문제 해결)
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member){
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
