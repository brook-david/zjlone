queryByParams
===
* 注释

    select #use("cols")# from t_intelligent_stock where #use("condition")#
    
updateNoNullById
===
	update t_intelligent_stock set #use("updateCols")# where stock_id = #stockId#
	
deleteById
===
	delete from t_intelligent_stock where stock_id = #stockId#

cols
===
    stock_id,
    model_id,
    sn_code,
    mac,
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
    @if(!isEmpty(snCode)){
    sn_code=#snCode#,
    @}
    @if(!isEmpty(mac)){
    mac=#mac#,
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
    @if(!isEmpty(stockId)){
     and stock_id=#stockId#
    @}
    @if(!isEmpty(modelId)){
     and model_id=#modelId#
    @}
    @if(!isEmpty(snCode)){
     and sn_code=#snCode#
    @}
    @if(!isEmpty(mac)){
     and mac=#mac#
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
