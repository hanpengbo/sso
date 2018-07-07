package com.lvzheng.service.sso.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KVMap {
	public static Map<Integer,String> intentmap = new HashMap<Integer,String>();
	static{
		intentmap.put(1, "低");
		intentmap.put(2, "中");
		intentmap.put(3, "高");
		
	}
	
	public static Map<Integer,String> oneselflag = new HashMap<Integer,String>();
	static{
		oneselflag.put(1, "自营");
		oneselflag.put(2, "第三方");
	}
	
	public static Map<String,String> sell_upderdesc = new HashMap<String,String>();
	static{
		sell_upderdesc.put("0", "否");
		sell_upderdesc.put("1", "是");
		sell_upderdesc.put("2", "后台");
	}
	
	public static Map gezfeemap = new HashMap();//个体注册收费表
	static{
		gezfeemap.put(101, 598f);
		gezfeemap.put(102, 598f);
		gezfeemap.put(103, 598f);
		gezfeemap.put(104, 598f);
		gezfeemap.put(105, 598f);
		gezfeemap.put(106, 598f);
		gezfeemap.put(107, 598f);
		gezfeemap.put(108, 598f);
		gezfeemap.put(109, 598f);
		gezfeemap.put(110, 598f);
		gezfeemap.put(111, 598f);
		gezfeemap.put(112, 598f);
		gezfeemap.put(113, 598f);
		gezfeemap.put(114, 598f);
		gezfeemap.put(115, 598f);
		gezfeemap.put(116, 598f);
	}
	public static Map bgnzfeemap = new HashMap();
	static{
		bgnzfeemap.put(1001, 1198f);
		bgnzfeemap.put(1002, 998f);
		bgnzfeemap.put(1003, 798f);
		bgnzfeemap.put(1004, 598f);
		
	}
	public static Map bgwzfeemap = new HashMap();
	static{
		bgwzfeemap.put(1001, 2598f);
		bgwzfeemap.put(1002, 2398f);
		bgwzfeemap.put(1003, 2198f);
		bgwzfeemap.put(1004, 1198f);
	}
	public static Map dldzfeemap = new HashMap();
	static{
		dldzfeemap.put(101, 4000f);
		dldzfeemap.put(102, 5000f);
		dldzfeemap.put(103, 4000f);
		dldzfeemap.put(104, 3300f);
		dldzfeemap.put(105, 3500f);
		dldzfeemap.put(106, 5000f);
		dldzfeemap.put(107, 5000f);
		dldzfeemap.put(109, 5000f);
		
	}
	public static Map dldzwzfeemap = new HashMap();
	static{
		dldzwzfeemap.put(101, 10000f);
		dldzwzfeemap.put(102, 10000f);
		dldzwzfeemap.put(103, 10000f);
		dldzwzfeemap.put(104, 10000f);
		dldzwzfeemap.put(105, 10000f);
		dldzwzfeemap.put(106, 10000f);
		dldzwzfeemap.put(107, 10000f);
		dldzwzfeemap.put(108, 10000f);
		dldzwzfeemap.put(109, 10000f);
	}
	public static Map dzfeemap = new HashMap();//区域注册地址
	static{
		dzfeemap.put(101, 598f);
		dzfeemap.put(102, 598f);
		dzfeemap.put(103, 598f);
		dzfeemap.put(104, 598f);
		dzfeemap.put(105, 598f);
		dzfeemap.put(106, 598f);
		dzfeemap.put(107, 598f);
		dzfeemap.put(108, 598f);
		dzfeemap.put(109, 598f);
		dzfeemap.put(110, 598f);
		dzfeemap.put(111, 598f);
		dzfeemap.put(112, 598f);
		dzfeemap.put(113, 598f);
		dzfeemap.put(114, 598f);
		dzfeemap.put(115, 598f);
		dzfeemap.put(116, 598f);
	}
	public static Map jzfeemap = new HashMap();
	static{
		jzfeemap.put(1, 0f);
		jzfeemap.put(2, 1600f);
		jzfeemap.put(3, 3000f);
	}
	public static Map jzstr = new HashMap();
	static{
		jzstr.put(1, "代理记账3个月");
		jzstr.put(2, "代理记账6个月");
		jzstr.put(3, "代理记账1年");
	}
	public static Map jzfee = new HashMap();
	static{
		jzfee.put(3001, 900f);
		jzfee.put(3002, 1600f);
		jzfee.put(3003, 3000f);
		jzfee.put(4001, 3000f);
		jzfee.put(4002, 4000f);
		jzfee.put(4003, 6000f);
	}
	
	public static Map citymap = new HashMap();
	static{
		citymap.put(1, "北京");
		citymap.put(2, "深圳");
		citymap.put(3, "北京渠道");
		citymap.put(77, "全深圳");
		citymap.put(88, "全北京");
		citymap.put(99, "全国");
		citymap.put(211, "前海");
		citymap.put(301, "渠道");
		citymap.put(777, "全深圳");
		citymap.put(888, "全北京");
		citymap.put(999, "全国");
	}
	public static Map localmap = new LinkedHashMap();
	public String getLocalStrbyids(String ids){
		String rs = "";
		if(ids.split(",").length > 0){
			String[] a = ids.split(",");
			for(String str : a){
				rs = rs + localmap.get(str)+",";
			}
			if(rs.length() > 1){
				rs = rs.substring(0, rs.length() - 1);
			}
		}
		return rs;
	}
	static{
		localmap.put("1", "北京");
		localmap.put("101", "东城");
		localmap.put("102", "西城");
		localmap.put("103", "朝阳");
		localmap.put("104", "海淀");
		localmap.put("105", "丰台");
		localmap.put("106", "石景山");
		localmap.put("107", "通州");
		localmap.put("108", "昌平");
//		localmap.put("109", "顺义");
//		localmap.put("110", "平谷");
//		localmap.put("111", "怀柔");
//		localmap.put("112", "密云");
//		localmap.put("113", "延庆");
//		localmap.put("114", "门头沟");
//		localmap.put("115", "房山");
//		localmap.put("116", "大兴");
		localmap.put("2", "深圳");
		localmap.put("201", "福田区");
		localmap.put("202", "罗湖区");
		localmap.put("203", "南山区");
		localmap.put("204", "宝安区");
		localmap.put("205", "龙岗区");
		localmap.put("206", "盐田区");
		localmap.put("207", "光明新区");
		localmap.put("208", "龙华新区");
		localmap.put("209", "坪山新区");
		localmap.put("210", "大鹏新区");
		localmap.put("211", "前海");
	}
	public static Map careemap = new HashMap();
	static{
		careemap.put("4", "管理员");
		careemap.put("1", "售前客服");
		careemap.put("2", "咨询顾问");
		careemap.put("7", "服务专员");
		careemap.put("3", "劳务");
		careemap.put("6", "运营");
		careemap.put("5", "财务");
		
		careemap.put("8", "售后客服");
		careemap.put("9", "服务顾问");
		careemap.put("10", "品控专员");
		
	}
	public static Map ordermap = new HashMap();
	
	static{
		ordermap.put("1101", "公司注册");
		ordermap.put("1102", "公司变更");
		ordermap.put("1103", "公司注销");
		ordermap.put("1104", "商标注册");
		
		ordermap.put("1301", "图形商标");
		ordermap.put("1302", "图形商标");
		ordermap.put("1303", "图形商标");
		
		
		ordermap.put("1105", "代理记账");
		ordermap.put("1201", "个体注册");
		ordermap.put("1202", "个体变更");
		ordermap.put("1203", "个体注销");
	}
	public static Map orderstatemap = new HashMap();
	static{
		orderstatemap.put("1", "下单成功");
		orderstatemap.put("2", "订单取消");
		orderstatemap.put("3", "已派单");
		orderstatemap.put("4", "待付款");
		orderstatemap.put("5", "已付款");
		orderstatemap.put("6", "放弃");
		orderstatemap.put("7", "待处理订单");
		
		orderstatemap.put("9", "删除");
		orderstatemap.put("10", "订单完结");
	}
	public static Map actionfirst = new HashMap();
	static{
		//工商注册
		actionfirst.put("1104", "您好，您的签约订单已创建成功！");
		actionfirst.put("1105", "您好，您的公司核名申请已提交，工商局将会在5个工作日内完成审核。");
		actionfirst.put("1106", "您好，您的公司核名申请已通过，小微将于24小时内为您提交公司设立网上申请。网上申请一旦提交，信息将不能更改。");
		actionfirst.put("1107", "您好，您的公司设立网上申请已提交。工商局将会在5个工作日内完成审核。");
		actionfirst.put("1108", "您好，您的公司设立网上申请已通过。小微将根据您的材料准备情况为您预约柜台审核时间。");
		actionfirst.put("1109", "您好，您的公司设立柜台审核已通过。工商局将于5个工作日后下发营业执照(正、副本)。");
		actionfirst.put("1110", "您好，您的营业执照已领取。小微将于24小时内为您办理公章刻制及备案。");
		actionfirst.put("1111", "您好，您的公章、合同章、财务专用章、法代人名章已刻制并完成备案。小微将于24小时内为您办理组织机构代码证。");
		actionfirst.put("1112", "您好，您的组织机构代码证已办理。小微将于24小时内为您办理税务登记证。");
		
		actionfirst.put("1113", "您好，您的税务登记证已办理。请您支付订单费用。小微收到您的付款后，将于2小时内安排快递。");
		actionfirst.put("1114", "您好，您的订单费用已收到，小微已将【营业执照】、【组织机构代码证】、【税务登记证】、【公章、合同章、财务专用章、法代人名章】打包快递，3个工作日内送达，请注意查收。");
		actionfirst.put("1115", "您好，您的快递已接收，服务已完成。感谢您的参与，期待与您再次合作。");
		//公司变更
		actionfirst.put("1204", "您好，您的签约订单已创建成功！");
		actionfirst.put("1205", "您好，您的公司核名申请已提交，工商局将会在5个工作日内完成审核。");
		actionfirst.put("1206", "您好，您的公司核名申请已通过，小微将于24小时内为您提交公司设立网上申请。网上申请一旦提交，信息将不能更改。");
		actionfirst.put("1207", "您好，您的公司变更网上申请已提交。工商局将会在5个工作日内完成审核。");
		actionfirst.put("1208", "您好，您的公司变更网上申请已通过。小微将根据您的材料准备情况为您预约柜台审核时间");
		actionfirst.put("1209", "您好，您的公司变更柜台审核已通过。工商局将于5个工作日后下发营业执照(正、副本)。");
		actionfirst.put("1210", "您好，您的营业执照已领取。小微将于24小时内为您办理公章刻制及公安备案。");
		actionfirst.put("1211", "您好，您的公章、合同章、财务专用章已刻制并完成备案。小微将于24小时内为您办理组织机构代码证。");
		actionfirst.put("1212", "您好，您的组织机构代码证已办理。小微将于24小时内为您办理税务登记证。");
		
		actionfirst.put("1213", "您好，您的税务登记证已办理，发票专用章已经备案。请您支付订单费用。支付完成后，小微将于2小时内安排快递。");
		actionfirst.put("1214", "您好，您的订单费用已收到，小微已将【营业执照】、【组织机构代码证】、【税务登记证】、【公章、合同章、财务专用章、发票专用章】打包快递，3个工作日内送达，请注意查收。");
		actionfirst.put("1215", "您好，您的快递已接收，服务已完成。感谢您的参与，期待与您再次合作。");
		
		//公司住所或法人变更
		actionfirst.put("1304", "您好，您的签约订单已创建成功！");
		actionfirst.put("1305", "您好，您的公司变更服务网上申请已提交。工商局将会在5个工作日内完成审核。");
		actionfirst.put("1306", "您好，您的公司变更网上申请已通过。小微将根据您的材料准备情况为您预约柜台审核时间。");
		actionfirst.put("1307", "您好，您的公司变更柜台审核已通过。工商局将于5个工作日后下发营业执照(正、副本)。");
		actionfirst.put("1308", "您好，您的营业执照已领取。小微将于24小时内为您办理组织机构代码证。");
		actionfirst.put("1309", "您好，您的组织机构代码证已办理。小微将于24小时内为您办理税务登记证。");
		actionfirst.put("1310", "您好，您的税务登记证已办理。请您支付订单费用。支付完成后，小微将于3小时内安排快递。");
		actionfirst.put("1314", "您好，您的订单费用已收到，小微已将【营业执照】、【组织机构代码证】、【税务登记证】打包快递，3个工作日内送达，请注意查收。");
		actionfirst.put("1315", "您好，您的快递已接收，服务已完成。感谢您的参与，期待与您再次合作。");
		
		//注册资本变更
		actionfirst.put("1404", "您好，您的签约订单已创建成功!");
		actionfirst.put("1405", "您好，您的公司变更服务网上申请已提交。工商局将会在5个工作日内完成审核。");
		actionfirst.put("1406", "您好，您的公司变更网上申请已通过。小微将根据您的材料准备情况为您预约柜台审核时间。");
		actionfirst.put("1407", "您好，您的公司变更柜台审核已通过。工商局将于5个工作日后下发营业执照(正、副本)。");
		actionfirst.put("1408", "您好，您的营业执照已领取。小微将于24小时内为您办理税务登记证。");
		actionfirst.put("1409", "您好，您的税务登记证已变更。请您支付订单费用。支付完成后，小微将于3小时内安排快递。");
		actionfirst.put("1414", "您好，您的订单费用已收到，小微已将【营业执照】、【税务登记证】打包快递，3个工作日内送达，请注意查收。");
		actionfirst.put("1415", "您好，您的快递已接收，服务已完成。感谢您的参与，期待与您再次合作。");
		
		//股东变更
		actionfirst.put("1504", "您好，您的签约订单已创建成功！如需帮助，请联系您的专属法律顾问！");
		actionfirst.put("1505", "您好，您的公司变更服务网上申请已提交。工商局将会在5个工作日内完成审核。");
		actionfirst.put("1506", "您好，您的公司变更网上申请已通过。小微将根据您的材料准备情况为您预约柜台审核时间。");
		actionfirst.put("1507", "您好，您的公司变更柜台审核已通过。小微将于24小时内为您办理税务登记证。");
		actionfirst.put("1508", "您好，您的税务登记证已办理。请您支付订单费用。支付完成后，小微将于3小时内安排快递。");
		actionfirst.put("1514", "您好，您的订单费用已收到，小微已将您的资料打包快递，7个工作日内送达，请注意查收。");
		actionfirst.put("1515", "您好，您的快递已接收，服务已完成。感谢您的参与，期待与您再次合作。");
		
	}
	public static Map actionremark = new HashMap();
	static{
		//股东变更
		actionremark.put("1504", "当前阶段:创建完成\n下一阶段:公司变更服务网上申请\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1505", "当前阶段:公司变更服务网上申请(已提交)\n下一阶段:等待网上申请通过\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1506", "当前阶段:公司变更服务网上申请(已通过)\n下一阶段:公司变更材料柜台审核\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1507", "当前阶段:公司变更柜台审核(已通过)\n下一阶段:税务登记证\n若需帮助，请与您的专属法律顾问联系。");
		
		actionremark.put("1508", "bank_ino \n订单费用:order_fee元(未支付)\n当前阶段:税务登记证(已完成)\n下一阶段:核查订单费用后安排快递\n若需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1514", "订单费用:order_fee元(已支付)\n当前阶段:已发快递\npost_info\n下一阶段:验收证件\n如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1515", "如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		
		//注册资本变更
		actionremark.put("1404", "当前阶段:创建完成\n下一阶段:公司变更服务网上申请\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1405", "当前阶段:公司变更服务网上申请(已提交)\n下一阶段:等待网上申请通过\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1406", "当前阶段:公司变更服务网上申请(已通过)\n下一阶段:公司变更材料柜台审核\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1407", "当前阶段:公司变更柜台审核(已通过)\n下一阶段:领取《营业执照》\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1408", "当前阶段:《营业执照》(已领取)\n下一阶段:税务登记证\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1409", "bank_ino \n订单费用:order_fee元(未支付)\n当前阶段:税务登记证(已完成)\n下一阶段:核查订单费用后安排快递\n若需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1414", "订单费用:order_fee元(已支付)\n当前阶段:已发快递\npost_info\n下一阶段:验收证件\n如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1415", "如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		
		//公司住所或法人变更
		actionremark.put("1304", "当前阶段:创建完成\n下一阶段:公司变更服务网上申请\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1305", "当前阶段:公司变更服务网上申请(已提交)\n下一阶段:等待网上申请通过\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1306", "当前阶段:公司变更服务网上申请(已通过)\n下一阶段:公司变更材料柜台审核\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1307", "当前阶段:公司变更柜台审核(已通过)\n下一阶段:领取《营业执照》\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1308", "当前阶段:《营业执照》(已领取)\n下一阶段:组织机构代码证\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1309", "当前阶段:组织机构代码证(已完成)\n下一阶段:税务登记证\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1310", "bank_ino \n订单费用:order_fee元(未支付)\n当前阶段:税务登记证(已完成)\n下一阶段:核查订单费用后安排快递\n若需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1314", "订单费用:order_fee元(已支付)\n当前阶段:已发快递\npost_info\n下一阶段:验收证件\n如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1315", "如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		
		
		actionremark.put("1201", "订单金额:1400元\n服务项目:公司名称变更\n如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1204", "当前阶段:公司变更服务网上申请(已提交)\n下一阶段:核名申请\n 若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1205", "当前阶段:核名申请(已提交)\n下一阶段:领取《核名通知书》\n 若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1206", "当前阶段:核名申请(已通过)\n下一阶段:公司变更网上申请\n若需帮助，请与您的专属法律顾问联系。\n");
		actionremark.put("1207", "当前阶段:公司变更网上申请(已提交)\n下一阶段:领取《公司设立通知书》\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1208", "当前阶段:公司变更网上申请(已通过)\n下一阶段:公司变更材料柜台审核\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1209", "当前阶段:公司变更柜台审核(已通过)\n下一阶段:领取《营业执照》\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1210", "当前阶段:《营业执照》(已领取)\n下一阶段:刻制公章及备案\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1211", "当前阶段:公章刻制(已完成)\n下一阶段:组织机构代码证\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1212", "当前阶段:税务登记证(已完成)\n下一阶段:核查订单费用后安排快递\n若需帮助，请与您的专属法律顾问联系。\n");
		actionremark.put("1213", "bank_ino \n订单费用:order_fee元(未支付)\n当前阶段:税务登记证(已完成)\n下一阶段:核查订单费用后安排快递\n若需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		//客服流程
		actionremark.put("1214", "订单费用:order_fee元(已支付)\n当前阶段:已发快递\npost_info\n下一阶段:验收证件\n如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1215", "如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		
		actionremark.put("1104", "当前阶段:创建完成\n下一阶段:提交核名申请\n 若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1105", "当前阶段:核名申请(已提交)\n下一阶段:领取《核名通知书》\n 若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1106", "当前阶段:核名申请(已通过)\n下一阶段:公司设立网上申请\n若需帮助，请与您的专属法律顾问联系。\n");
		actionremark.put("1107", "当前阶段:公司设立网上申请(已提交)\n下一阶段:领取《公司设立通知书》\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1108", "当前阶段:公司设立网上申请(已通过)\n下一阶段:公司设立材料柜台审核\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1109", "当前阶段:公司设立柜台审核(已通过)\n下一阶段:领取《营业执照》\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1110", "当前阶段:《营业执照》(已领取)\n下一阶段:刻制公章及备案\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1111", "当前阶段:公章刻制(已完成)\n下一阶段:组织机构代码证\n若需帮助，请与您的专属法律顾问联系。");
		actionremark.put("1112", "当前阶段:组织机构代码证(已完成)\n下一阶段:税务登记证\n若需帮助，请与您的专属法律顾问联系。\n");
		actionremark.put("1113", "支付方式:bank_ino \n订单费用:order_fee元(未支付)\n当前阶段:税务登记证(已完成)\n下一阶段:核查订单费用后安排快递\n若需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		//客服流程
		actionremark.put("1114", "订单费用:order_fee元(已支付)\n当前阶段:已发快递\npost_info\n下一阶段:验收证件\n如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		actionremark.put("1115", "如需帮助，请拨打客服电话:400-085-3639或者直接在微信上留言。");
		
	}
	public static Map actionmap = new HashMap();
	static{
		actionmap.put("1100", "员工添加订单");
		actionmap.put("1101", "订单提交成功");
		actionmap.put("1102", "服务已指派给法律顾问【FW_NAME】，<a href='FW_TEL'>法律顾问:FW_NAME - FW_TEL</tel> ");
		actionmap.put("1103", "分派劳务");
		
		actionmap.put("1104", "您好，您的签约订单已创建成功！");//1104-15101120984
		actionmap.put("1105", "公司核名申请已通过");
		actionmap.put("1106", "公司设立网上申请已提交");
		actionmap.put("1107", "公司设立网上申请已通过");
		actionmap.put("1108", "公司设立材料柜台审核已通过");
		actionmap.put("1109", "公司营业执照已取回");
		actionmap.put("1110", "公司公章刻制及备案已完成");
		actionmap.put("1111", "公司组织机构代码证已完成");
		actionmap.put("1112", "公司税务登记证已完成");
		
		//公司变更
		actionmap.put("1204", "公司核名已提交");
		actionmap.put("1205", "公司核名申请已通过");
		actionmap.put("1206", "公司变更网上申请已提交");
		actionmap.put("1207", "公司变更网上申请已通过");
		actionmap.put("1208", "公司变更材料柜台申请已通过");
		actionmap.put("1209", "公司营业执照已取回");
		actionmap.put("1210", "公司公章刻制及备案已完成");
		actionmap.put("1211", "公司组织机构代码证已完成");
				
		actionmap.put("1212", "公司税务登记证已完成");
//		actionmap.put("1213", "您好，您的订单费用已收到，小微已将【营业执照】、【组织机构代码证】、【税务登记证】、【公章、合同章、财务专用章、法人章】打包快递，3个工作日内送达，请注意查收。");
//		actionmap.put("1214", "订单消息通知");
//				
				//公司住所或法人变更
		actionmap.put("1304", "变更服务网上申请已提交");
		actionmap.put("1305", "变更服务网上申请已通过");
		actionmap.put("1306", "变更服务柜台申请已通过");
		actionmap.put("1307", "营业执照已领取");
		actionmap.put("1308", "组织机构代码证已办理");
		actionmap.put("1309", "税务登记证已办理");
		//actionmap.put("1312", "您好，您的税务登记证已办理。请您支付订单费用。支付完成后，小微将于2小时内安排快递。");
//		actionmap.put("1313", "您好，您的订单费用已收到，小微已将【营业执照】、【组织机构代码证】、【税务登记证】打包快递，3个工作日内送达，请注意查收。");
//		actionmap.put("1314", "订单消息通知");
				
				//注册资本变更
		actionmap.put("1404", "变更服务网上申请已提交");
		actionmap.put("1405", "变更服务网上申请已通过");
		actionmap.put("1406", "变更服务柜台申请已通过");
		actionmap.put("1407", "营业执照已领取");
		actionmap.put("1408", "税务登记证已办理");
//		actionmap.put("1412", "您好，您的税务登记证已办理。请您支付订单费用。支付完成后，小微将于2小时内安排快递。");
//		actionmap.put("1413", "您好，您的订单费用已收到，小微已将【营业执照】、【税务登记证】打包快递，6个工作日内送达，请注意查收。");
//		actionmap.put("1414", "订单消息通知");
				
				//股东变更
		actionmap.put("1504", "变更服务网上申请已提交");
		actionmap.put("1505", "变更服务网上申请已通过");
		actionmap.put("1506", "变更服务柜台申请已通过");
		actionmap.put("1507", "税务登记证已办理");
//		actionmap.put("1512", "您好，您的税务登记证已办理。请您支付订单费用。支付完成后，小微将于3小时内安排快递。");
//		
//		actionmap.put("1513", "您好，您的订单费用已收到，小微已将【税务登记证】打包快递，7个工作日内送达，请注意查收。");
//		actionmap.put("1514", "订单消息通知");
		
		//客服流程
		actionmap.put("1113", "证件已发快递，post_info");
		actionmap.put("1114", "servicename服务已办结");
		
		actionmap.put("1199", "订单已取消");
	}
	public static Map bgtypemap = new HashMap();
	static{
		bgtypemap.put("1", "公司名称变更");
		bgtypemap.put("2", "公司地址变更");
		bgtypemap.put("3", "法人变更");
		bgtypemap.put("4", "董事变更");
		bgtypemap.put("5", "监事变更");
		bgtypemap.put("6", "经理变更");
		bgtypemap.put("99", "其他");
		
	}
	public static Map companytype = new HashMap();
	static{
		companytype.put(1, "内资公司");
		companytype.put(2, "外资公司");
		companytype.put(3, "香港公司");
		companytype.put(4, "海外公司");
	}
	public static Map hymap = new HashMap();
	static{
		hymap.put(1, "互联网-软件");
		hymap.put(2, "信息传媒");
		hymap.put(3, "金融");
		hymap.put(4, "服务业");
		hymap.put(5, "教育");
		hymap.put(6, "医疗服务");
		hymap.put(7, "艺术娱乐");
		hymap.put(8, "制造加工");
		hymap.put(9, "地产建筑");
		hymap.put(10, "贸易零售");
		hymap.put(11, "公共服务");
		hymap.put(12, "开采冶金");
		hymap.put(13, "交通仓储");
		hymap.put(14, "农林牧渔");
		hymap.put(99, "其他");
	}
	
	public static Map serviemap = new HashMap();
	static{
		serviemap.put(1001, "工商注册");
		serviemap.put(1002, "代理地址");
		serviemap.put(1003, "银行开户");
		serviemap.put(1004, "税务报道");
		serviemap.put(1005, "社会工基金开户");
		serviemap.put(1006, "章程制定");
		serviemap.put(1007, "股权协议");
		serviemap.put(1008, "合同审核");
		serviemap.put(1009, "股权出质");
		serviemap.put(1010, "一般纳税人");
		serviemap.put(2001, "公司名称变更");
		serviemap.put(2002, "住所、法代变更");
		serviemap.put(2003, "注册资本、经营范围营业期限变更");
		serviemap.put(2004, "股东（名称）变更、公司登记备案");
		serviemap.put(3001, "一类商标");
		serviemap.put(3002, "二类商标");
		serviemap.put(3003, "三类商标");
		serviemap.put(3004, "四类商标");
		serviemap.put(4001, "代理记账");
	}
	
	public static Map servietopmap = new HashMap();
	static{
		serviemap.put(1001, "工商注册");
		serviemap.put(1002, "代理地址");
		serviemap.put(1003, "银行开户");
		serviemap.put(1004, "税务报道");
		serviemap.put(1005, "社会工基金开户");
		serviemap.put(1006, "章程制定");
		serviemap.put(1007, "股权协议");
		serviemap.put(1008, "合同审核");
		serviemap.put(1009, "股权出质");
		serviemap.put(1010, "一般纳税人");
		serviemap.put(2001, "公司名称变更");
		serviemap.put(2002, "住所、法代变更");
		serviemap.put(2003, "注册资本、经营范围营业期限变更");
		serviemap.put(2004, "股东（名称）变更、公司登记备案");
		serviemap.put(3001, "一类商标");
		serviemap.put(3002, "");
		serviemap.put(4001, "代理记账");
	}
	
	public static final Integer pageCount = 10;
}
