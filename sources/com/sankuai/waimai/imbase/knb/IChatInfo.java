package com.sankuai.waimai.imbase.knb;

import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
import com.sankuai.xm.im.session.entry.a;
import java.util.List;
import java.util.Set;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IChatInfo {
    public static final String SG_KEY = "sg_chatinfo_group";
    public static final String WM_FOOD_SAFETY_KEY = "wm_food_safety_group";
    public static final String WM_KEY = "wm_chatinfo_group";
    public static final String WM_USER_KEY = "wm_user_group";

    d<List<GetAllSessionListHandler.a>> getChatInfo(List<a> list, Set<Long> set);
}
