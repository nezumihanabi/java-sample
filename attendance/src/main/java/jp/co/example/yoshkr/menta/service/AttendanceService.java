package jp.co.example.yoshkr.menta.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.yoshkr.menta.domain.Attendance;
import jp.co.example.yoshkr.menta.repository.AttendanceRepository;

@Service
@Transactional
public class AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    public Optional<Attendance> findMember(Long id){
        return attendanceRepository.findById(id);
    }
    public List<Attendance> findMembers(){
        return attendanceRepository.findAll();
    }
    public Attendance save(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }
    public void delete(Long id) {
    	attendanceRepository.deleteById(id);
    }
}
