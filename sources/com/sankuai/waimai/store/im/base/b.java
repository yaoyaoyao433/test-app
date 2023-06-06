package com.sankuai.waimai.store.im.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotPraiseData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T extends SGIMRobotPraiseData> extends c<T> {
    public static ChangeQuickRedirect a;
    protected long b;

    public void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable T t) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.store.im.base.c
    public /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable Object obj) {
        a(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, (com.sankuai.xm.imui.session.entity.b) ((SGIMRobotPraiseData) obj));
    }

    public b(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, long j) {
        super(aVar, bundle);
        Object[] objArr = {aVar, bundle, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb43d4d03865d984e0b403020eb81e6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb43d4d03865d984e0b403020eb81e6e");
            return;
        }
        this.d = aVar;
        this.e = bundle;
        this.b = j;
    }

    public final void a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable T t) {
        Object[] objArr = {bVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e62a9796b30615f0acbc46ccecd2dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e62a9796b30615f0acbc46ccecd2dd6");
        } else if (bVar == null || t == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new String(bVar.b.getData(), "utf-8"));
                jSONObject.put("data", new JSONObject(com.sankuai.waimai.store.util.i.a(t)));
                bVar.b.setData(((String) Objects.requireNonNull(jSONObject.toString())).getBytes());
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }
}
