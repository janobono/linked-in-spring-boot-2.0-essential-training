package sk.janobono.sbet.roomwebapp.service;

import org.springframework.stereotype.Service;
import sk.janobono.sbet.roomwebapp.data.StaffMemberRepository;
import sk.janobono.sbet.roomwebapp.model.StaffMember;

import java.util.List;

@Service
public class StaffService {

    private final StaffMemberRepository staffMemberRepository;

    public StaffService(StaffMemberRepository staffMemberRepository) {
        this.staffMemberRepository = staffMemberRepository;
    }

    public List<StaffMember> getAllStaff() {
        return staffMemberRepository.findAll();
    }
}
