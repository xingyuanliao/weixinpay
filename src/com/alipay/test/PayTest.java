package com.alipay.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PayTest {
	public static void main(String[] args) {
		String app_id = "2016051201394880";

        String url = "https://openapi.alipay.com/gateway.do";
        Map<String,String> params = new HashMap<String,String>();
        params.put("app_id",app_id);
        params.put("method","alipay.data.dataservice.bill.downloadurl.query");
        params.put("charset","utf-8");
        params.put("sign_type","RSA");
        params.put("timestamp", DateUtil.dateFormat(new Date()));
        params.put("version","1.0");

        String privateKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAMOvpizdjcG0rn/8niR1GfWT3XX4iu1czbQLeORd2mzMMKY7Qjd24ybVJgVjoGSYc5sjtFFESwjJnbLZ9fKZPsonXvMj94Q1CPghjpbdfLhAsHlT5X7Skx26sda7UXq3jgmuIlhKYMb7GAlZX+2usX5lnLlyN+WcYR+68FgIhIoXAgMBAAECgYBpk/hFVpfn/fL0LLiqFOAXplqjDqDuJdb6IAJuu9BgSN6qoWg9gpBV4ERuPe1IuRQOjPn5qq4NJLJHz98pr9K2zX+45BFjL78FRLEs1jy5o4UqKgMZriyErvul2zWVWPAlbOzDx/Bike5e/oPT9Nll7rC7dAN8oRQpWk2Zdg+2yQJBAP5OJ/dtbbSffVsAXq5pb4gdd4Nu8HiUWK4v7eJsUMuqkFJwpJBTOigr3MVF0XivlTZaDXMhsyIotQPV7PVkb0MCQQDE/X0qC/yPRF377tsAdcGryi+DFkmmIxgNVnEOCn8cbA/MUY6CCSFHP5n54i9R2Zt0f8xgKyq4IZ9EaDbKKpqdAkByVX9AjhFpyN8aP/NRpRPA9caa8BDrlX69ac0hJKO6vce/WOeT/+dA0l+izf4crYx/cENlxPv92qFvxQmRVoNzAkBStdBg4CmKCf2gMzj253qK49ixJKGFxURrDTlo2NVoHKNBeZjpVmYHoVfISMTvi/uunZ41XsqQB2X09gDTP7ItAkAoZuS6xBY5j74Auf3GC5MSZLsAeW1ytoyAurKPYpC7qhE1fENyYYgh5ZOdvziky2RGlqlFsnnbtbXlaVhMiW4P";

        Map<String,String> map = new HashMap<String,String>();
        map.put("bill_type","trade");
        map.put("bill_date","2016-07-01");
//        params.put("biz_content",JSON.serialize(map));
//
//        params.put("sign", sign(params, privateKey));

	}
}
