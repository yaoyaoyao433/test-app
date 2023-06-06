package com.sankuai.waimai.business.im.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.j;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends b implements com.sankuai.waimai.business.im.delegate.a {
    public static ChangeQuickRedirect h;
    public com.sankuai.xm.imui.session.entity.b<GeneralMessage> i;

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull @NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return viewGroup;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae2a5b85eea769843656c57235fdfee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae2a5b85eea769843656c57235fdfee");
        } else if (h() == null || h().getLayoutParams() == null) {
        } else {
            h().getLayoutParams().height = i2;
            h().getLayoutParams().width = i;
        }
    }

    public c(@NonNull @NotNull Context context, com.sankuai.waimai.business.im.common.contract.a aVar, String str) {
        super(context, aVar, str);
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ac73ee9eb06acee99ccc923bc352c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ac73ee9eb06acee99ccc923bc352c5");
        }
    }

    @Override // com.sankuai.waimai.business.im.mach.b
    public final Map<String, Object> a(j jVar, int i) {
        Object[] objArr = {jVar, 0};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70858385e35bfe7266821e74ac92fb37", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70858385e35bfe7266821e74ac92fb37");
        }
        HashMap hashMap = new HashMap();
        if (this.i != null && this.i.b != null) {
            hashMap.put("msg_id", Long.valueOf(this.i.b.getMsgId()));
            hashMap.put("chat_id", Long.valueOf(this.i.b.getChatId()));
            hashMap.put("order_id", a(this.i));
            hashMap.put("msg_code", jVar.a);
            User user = UserCenter.getInstance(com.meituan.android.singleton.b.a).getUser();
            if (user != null) {
                hashMap.put("user_id", Long.valueOf(user.id));
            }
        }
        if (this.d != null) {
            String r = this.d.r();
            String s = this.d.s();
            if (TextUtils.isEmpty(r)) {
                r = "-999";
            }
            hashMap.put("poi_id", r);
            if (aa.a(s)) {
                s = "";
            }
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, s);
            hashMap.put("chat_id", TextUtils.isEmpty(this.d.q()) ? "-999" : this.d.q());
            hashMap.put("im_chat_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(this.d.p())));
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.business.im.mach.b, com.sankuai.waimai.platform.base.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1802ae921a9b7b8614586b2331e1749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1802ae921a9b7b8614586b2331e1749");
        } else {
            super.e();
        }
    }

    private String a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784cf99e29b990f91fc8f42d96cae3b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784cf99e29b990f91fc8f42d96cae3b6");
        }
        String str = "";
        try {
            String extension = bVar.b.getExtension();
            if (TextUtils.isEmpty(extension)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(extension);
            String optString = jSONObject.optString("order_id");
            try {
                return TextUtils.isEmpty(optString) ? jSONObject.optString("chatfid") : optString;
            } catch (Exception e) {
                str = optString;
                e = e;
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return str;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
