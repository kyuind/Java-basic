package ClassC01;
// 생성자는 자동으로 호출되는 내가 만든 초기값.
public class Constructor02 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("user1",25,25); // 인스턴스 생성 // 초기값을 위해서 생성해 주는 것이 생성자
//        initMember(member1, "user1", 33, 33 );
//        member1.MemberInit("user", 22, 44);

        MemberInit member2 = new MemberInit("user2", 35); // 인스턴스 생성
//        initMember(member2, "user1", 33, 33 );
//        member2.MemberInit("user", 22, 44);

        MemberInit[] members = {member1, member2};

        for(MemberInit m : members){
            System.out.println("이름 : "+m.name+"나이"+m.age
                    +"성적" + m.grade);
        }

    }
    static void initMember(MemberInit member, String name, int age, int grad){
        member.name = name;
        member.age = age;
        member.grade = grad;
    }
}
