queryByParams
===
* 注释

    select #use("cols")# from t_return_pen_record where #use("condition")#
    
updateNoNullById
===
	update t_return_pen_record set #use("updateCols")# where int_pen_id = #intPenId#
	
deleteById
===
	delete from t_return_pen_record where int_pen_id = #intPenId#

cols
===
    int_pen_id,
    model_id,
    agency_id,
    sn_code,
    mac,
    to_stock,
    production_address,
    production_date,
    batch_number,
    delivery_number,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(modelId)){
    model_id=#modelId#,
    @}
    @if(!isEmpty(agencyId)){
    agency_id=#agencyId#,
    @}
    @if(!isEmpty(snCode)){
    sn_code=#snCode#,
    @}
    @if(!isEmpty(mac)){
    mac=#mac#,
    @}
    @if(!isEmpty(toStock)){
    to_stock=#toStock#,
    @}
    @if(!isEmpty(productionAddress)){
    production_address=#productionAddress#,
    @}
    @if(!isEmpty(productionDate)){
    production_date=#productionDate#,
    @}
    @if(!isEmpty(batchNumber)){
    batch_number=#batchNumber#,
    @}
    @if(!isEmpty(deliveryNumber)){
    delivery_number=#deliveryNumber#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(intPenId)){
     and int_pen_id=#intPenId#
    @}
    @if(!isEmpty(modelId)){
     and model_id=#modelId#
    @}
    @if(!isEmpty(agencyId)){
     and agency_id=#agencyId#
    @}
    @if(!isEmpty(snCode)){
     and sn_code=#snCode#
    @}
    @if(!isEmpty(mac)){
     and mac=#mac#
    @}
    @if(!isEmpty(toStock)){
     and to_stock=#toStock#
    @}
    @if(!isEmpty(productionAddress)){
     and production_address=#productionAddress#
    @}
    @if(!isEmpty(productionDate)){
     and production_date=#productionDate#
    @}
    @if(!isEmpty(batchNumber)){
     and batch_number=#batchNumber#
    @}
    @if(!isEmpty(deliveryNumber)){
     and delivery_number=#deliveryNumber#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
