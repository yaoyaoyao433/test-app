package com.dianping.judas;

import android.text.TextUtils;
import android.view.View;
import com.dianping.judas.interfaces.c;
import com.dianping.widget.view.d;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;
    public String b;
    private View c;
    private Map<c.a, EventInfo> d;
    private String e;
    private String f;
    private d g;

    public b(View view, d dVar) {
        Object[] objArr = {view, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975df7e89d687f16fd2fccd04b69aa32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975df7e89d687f16fd2fccd04b69aa32");
            return;
        }
        this.d = new HashMap();
        this.e = null;
        this.f = null;
        this.b = null;
        this.c = view;
        this.g = dVar;
    }

    @Override // com.dianping.judas.interfaces.c
    public final String getGAString() {
        return this.b;
    }

    @Override // com.dianping.judas.interfaces.c
    public final d getGAUserInfo() {
        return this.g;
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b9f1da2759ef148400ed19e162e8ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b9f1da2759ef148400ed19e162e8ee");
            return;
        }
        switch (aVar) {
            case CLICK:
                this.e = str;
                return;
            case VIEW:
                this.f = str;
                return;
            default:
                return;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2295401473a7d2c6815010e0a954f9d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2295401473a7d2c6815010e0a954f9d8");
        }
        switch (aVar) {
            case CLICK:
                return this.e;
            case VIEW:
                return this.f;
            default:
                return null;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de16f385ff39e4b3246c34afcee0a5b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de16f385ff39e4b3246c34afcee0a5b3");
        } else if (eventInfo != null) {
            this.d.put(aVar, eventInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ce94104a386537f3dada01c6cbaf24", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ce94104a386537f3dada01c6cbaf24");
        }
        EventInfo eventInfo = this.d.get(aVar);
        if (eventInfo == null) {
            eventInfo = new EventInfo();
            this.d.put(aVar, eventInfo);
        }
        if (eventInfo.val_lab == null) {
            eventInfo.val_lab = new HashMap();
        }
        if (this.g.r != null && this.g.r.intValue() != Integer.MAX_VALUE) {
            eventInfo.index = String.valueOf(this.g.r);
        }
        HashMap hashMap = new HashMap();
        this.g.a(hashMap, null);
        hashMap.remove("index");
        hashMap.remove("lx_channel");
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                if (((String) entry.getKey()).equals("custom")) {
                    try {
                        eventInfo.val_lab.put(entry.getKey(), new JSONObject((String) entry.getValue()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        com.dianping.judas.util.a.a("Invalid custom field!", new Object[0]);
                    }
                } else {
                    eventInfo.val_lab.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (TextUtils.isEmpty(eventInfo.val_bid)) {
            eventInfo.val_bid = a(aVar);
        }
        if (!TextUtils.isEmpty(this.b)) {
            eventInfo.element_id = this.b;
        }
        if (TextUtils.isEmpty(eventInfo.element_id)) {
            eventInfo.element_id = com.dianping.judas.util.b.c(this.c);
        }
        eventInfo.isAuto = 1;
        return eventInfo;
    }
}
