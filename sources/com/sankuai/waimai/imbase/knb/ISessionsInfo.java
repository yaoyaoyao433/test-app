package com.sankuai.waimai.imbase.knb;

import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import java.util.List;
import org.json.JSONArray;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ISessionsInfo {
    public static final String MED_B2C_IM = "med_b2c_im";

    d<List<GetAllSessionListHandler.a>> resolveSessionInfo(JSONArray jSONArray);
}
