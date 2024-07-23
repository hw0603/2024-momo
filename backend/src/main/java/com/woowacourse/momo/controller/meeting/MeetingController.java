package com.woowacourse.momo.controller.meeting;

import com.woowacourse.momo.controller.MomoApiResponse;
import com.woowacourse.momo.service.meeting.MeetingService;
import com.woowacourse.momo.service.meeting.dto.MeetingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MeetingController {

    @Value("${test.helloworld}")
    private String fromYaml;

    private final MeetingService meetingService;

    @GetMapping("/api/v1/meeting/{uuid}")
    public MomoApiResponse<MeetingResponse> find(@PathVariable String uuid) {
        MeetingResponse meetingResponse = meetingService.findByUUID(uuid);
        return new MomoApiResponse<>(meetingResponse);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "helloWorld";
    }
}
