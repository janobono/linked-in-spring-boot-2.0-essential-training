package sk.janobono.sbet.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.janobono.sbet.roomwebapp.model.StaffMember;

import java.util.UUID;

public interface StaffMemberRepository extends JpaRepository<StaffMember, UUID> {
}
