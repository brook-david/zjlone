queryByParams
===
* 注释

    select #use("cols")# from t_intelligent_pen_constant where #use("condition")#
    
updateNoNullById
===
	update t_intelligent_pen_constant set #use("updateCols")# where constant_id = #constantId#
	
deleteById
===
	delete from t_intelligent_pen_constant where constant_id = #constantId#

cols
===
    constant_id,
    int_pen_id,
    member_id,
    stage_selection,
    light_detection,
    grip_pose_detection,
    sit_pose_detection,
    time_detection,
    rest_time,
    use_time,
    light_tips,
    voice_tips,
    blue_tooth_tips,
    delay_tips,
    blue_tooth_auto_link,
    light_calibration,
    distance_calibration,
    create_time,
    modify_time

updateCols
===
    @trim(){
    @if(!isEmpty(intPenId)){
    int_pen_id=#intPenId#,
    @}
    @if(!isEmpty(memberId)){
    member_id=#memberId#,
    @}
    @if(!isEmpty(stageSelection)){
    stage_selection=#stageSelection#,
    @}
    @if(!isEmpty(lightDetection)){
    light_detection=#lightDetection#,
    @}
    @if(!isEmpty(gripPoseDetection)){
    grip_pose_detection=#gripPoseDetection#,
    @}
    @if(!isEmpty(sitPoseDetection)){
    sit_pose_detection=#sitPoseDetection#,
    @}
    @if(!isEmpty(timeDetection)){
    time_detection=#timeDetection#,
    @}
    @if(!isEmpty(restTime)){
    rest_time=#restTime#,
    @}
    @if(!isEmpty(useTime)){
    use_time=#useTime#,
    @}
    @if(!isEmpty(lightTips)){
    light_tips=#lightTips#,
    @}
    @if(!isEmpty(voiceTips)){
    voice_tips=#voiceTips#,
    @}
    @if(!isEmpty(blueToothTips)){
    blue_tooth_tips=#blueToothTips#,
    @}
    @if(!isEmpty(delayTips)){
    delay_tips=#delayTips#,
    @}
    @if(!isEmpty(blueToothAutoLink)){
    blue_tooth_auto_link=#blueToothAutoLink#,
    @}
    @if(!isEmpty(lightCalibration)){
    light_calibration=#lightCalibration#,
    @}
    @if(!isEmpty(distanceCalibration)){
    distance_calibration=#distanceCalibration#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @if(!isEmpty(modifyTime)){
    modify_time=#modifyTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(constantId)){
     and constant_id=#constantId#
    @}
    @if(!isEmpty(intPenId)){
     and int_pen_id=#intPenId#
    @}
    @if(!isEmpty(memberId)){
     and member_id=#memberId#
    @}
    @if(!isEmpty(stageSelection)){
     and stage_selection=#stageSelection#
    @}
    @if(!isEmpty(lightDetection)){
     and light_detection=#lightDetection#
    @}
    @if(!isEmpty(gripPoseDetection)){
     and grip_pose_detection=#gripPoseDetection#
    @}
    @if(!isEmpty(sitPoseDetection)){
     and sit_pose_detection=#sitPoseDetection#
    @}
    @if(!isEmpty(timeDetection)){
     and time_detection=#timeDetection#
    @}
    @if(!isEmpty(restTime)){
     and rest_time=#restTime#
    @}
    @if(!isEmpty(useTime)){
     and use_time=#useTime#
    @}
    @if(!isEmpty(lightTips)){
     and light_tips=#lightTips#
    @}
    @if(!isEmpty(voiceTips)){
     and voice_tips=#voiceTips#
    @}
    @if(!isEmpty(blueToothTips)){
     and blue_tooth_tips=#blueToothTips#
    @}
    @if(!isEmpty(delayTips)){
     and delay_tips=#delayTips#
    @}
    @if(!isEmpty(blueToothAutoLink)){
     and blue_tooth_auto_link=#blueToothAutoLink#
    @}
    @if(!isEmpty(lightCalibration)){
     and light_calibration=#lightCalibration#
    @}
    @if(!isEmpty(distanceCalibration)){
     and distance_calibration=#distanceCalibration#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
    @if(!isEmpty(modifyTime)){
     and modify_time=#modifyTime#
    @}
