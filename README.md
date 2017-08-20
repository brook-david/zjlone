app:
	密码使用Md5加密后上传服务器
	接口调用传参格式为:
		sign=&timestamp=&memberId=&......(给出的为必给参数，memberId登录注册时不用给，其他参数不限，参数顺序不限，)
	sign签名：
		witspal&(字头，当时间戳%2 ＝＝ 0时加上字头否则不加)timestamp=&memberId=&.....(Md5加密，注意本地加密顺序与上传顺序要一致)
	
开发：
	日志打开Debug,不然一些信息看不到。不必要的信息为Debug输出但是信息有助于发开者，必要信息使用Info打印
	Jfinal 设为开发者模式
上线：
	日志设置为Info。
	Jfinal 设为线上模式