package jp.co.example.yoshkr.menta.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.yoshkr.menta.domain.Attendance;
import jp.co.example.yoshkr.menta.service.AttendanceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;

    @RequestMapping(method=RequestMethod.GET, value="{id}")
    public Optional<Attendance> getMember(@PathVariable("id") Long id) {
        return attendanceService.findMember(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Attendance createMember(@Validated @RequestBody Attendance attendance) {
        return attendanceService.save(attendance);
    }

    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public Attendance updateMember(@PathVariable("id") Long id, @RequestBody Attendance attendance) {
        attendance.setId(id);
        return attendanceService.save(attendance);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public void deleteMember(@PathVariable("id") Long id) {
        attendanceService.delete(id);
    }
}