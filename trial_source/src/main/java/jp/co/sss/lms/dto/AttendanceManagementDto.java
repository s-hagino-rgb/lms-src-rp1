package jp.co.sss.lms.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 勤怠管理画面用DTO
 * 
 * @author 東京ITスクール
 */
@Component
@Data
@EqualsAndHashCode(callSuper = true)
public class AttendanceManagementDto extends StudentAttendanceDto {

	/** 当日フラグ */
	private Boolean isToday;
	/** 中抜け時間（文字列） */
	private String blankTimeValue;
	/** セクション名 */
	private String sectionName;
	/* 出勤時間（時）*/
	private String trainingStartHour;
	/* 出勤時間（分）*/
	private String trainingStartMinute;
	/* 退勤時間（時）*/
	private String trainingEndHour;
	/* 退勤時間（分）*/
	private String trainingEndMinute;
}
