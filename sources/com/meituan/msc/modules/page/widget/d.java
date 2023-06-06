package com.meituan.msc.modules.page.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.msc.modules.page.render.h;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.view.CoverViewWrapper;
import com.meituan.msc.modules.page.view.coverview.CoverViewRootContainer;
import com.meituan.msc.modules.page.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends e {
    public static ChangeQuickRedirect a;
    public h b;
    public volatile ConcurrentHashMap<String, List<String>> c;
    public View d;
    private FrameLayout j;
    private CoverViewRootContainer k;
    private CoverViewRootContainer l;
    private f m;
    private volatile ConcurrentHashMap<String, CoverViewRootContainer> n;
    private final List<a> o;
    private int p;
    private int q;

    public d(Context context, e.c cVar) {
        super(context);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea157a1262ed1fd55cc8c0783561cbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea157a1262ed1fd55cc8c0783561cbc");
            return;
        }
        this.k = null;
        this.l = null;
        this.n = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
        this.o = new CopyOnWriteArrayList();
        this.p = 0;
        this.q = 0;
        this.h = cVar;
    }

    @Override // com.meituan.msc.modules.page.widget.e
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba36c44e8582de5c237f72c45d207af7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba36c44e8582de5c237f72c45d207af7")).booleanValue() : this.k.getCoverViewScrollY() != 0;
    }

    public final void setContentView(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba64c8c7c2e481b447c8bc95042b09f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba64c8c7c2e481b447c8bc95042b09f");
            return;
        }
        if (this.j != null) {
            removeView(this.j);
        }
        this.b = hVar;
        this.j = new FrameLayout(getContext());
        this.l = new CoverViewRootContainer(getContext());
        this.j.addView(this.l, new FrameLayout.LayoutParams(-1, -1));
        this.j.addView(this.b.b(), new FrameLayout.LayoutParams(-1, -1));
        this.k = new CoverViewRootContainer(getContext());
        this.j.addView(this.k, new FrameLayout.LayoutParams(-1, -1));
        this.m = new f() { // from class: com.meituan.msc.modules.page.widget.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.render.webview.f
            public final void a(int i, int i2, int i3, int i4) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a009d791e0bc14f2ead1d9d2de7f6ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a009d791e0bc14f2ead1d9d2de7f6ba");
                    return;
                }
                if (d.this.k != null) {
                    d.this.k.a(i, i2, i3, i4);
                }
                if (d.this.l != null) {
                    d.this.l.a(i, i2, i3, i4);
                }
                d.this.p = i;
                d.this.q = i2;
            }
        };
        this.b.setOnContentScrollChangeListener(this.m);
        addView(this.j, new LinearLayout.LayoutParams(-1, -1));
    }

    public final CoverViewRootContainer getUnderCoverViewContainer() {
        return this.l;
    }

    public final CoverViewRootContainer getCoverViewContainer() {
        return this.k;
    }

    @WorkerThread
    public final void setRegionData(@NonNull String str) {
        JSONArray a2;
        a a3;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b09bae6fca96ae16b7e5e7b93c7441e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b09bae6fca96ae16b7e5e7b93c7441e");
            return;
        }
        List<a> list = this.o;
        Object[] objArr2 = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96a68dd93c16d52e274bb19c49eb3a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96a68dd93c16d52e274bb19c49eb3a63");
        } else if (str != null && list != null && (a2 = b.a(str)) != null) {
            list.clear();
            for (int i = 0; i < a2.length(); i++) {
                JSONObject optJSONObject = a2.optJSONObject(i);
                if (optJSONObject != null && (a3 = b.a(optJSONObject)) != null) {
                    list.add(a3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
        if (r6 < (r1.d + r1.f)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
        if (r6 < r13) goto L56;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(@android.support.annotation.NonNull android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.page.widget.d.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final CoverViewRootContainer a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eba2b16b18a861ed07db5f839fc68c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eba2b16b18a861ed07db5f839fc68c4");
        }
        if (this.n.containsKey(str)) {
            return this.n.get(str);
        }
        com.meituan.msc.modules.page.view.coverview.b bVar = new com.meituan.msc.modules.page.view.coverview.b(getContext());
        bVar.setInterceptTouchEvent(true);
        bVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.n.put(str, bVar);
        return bVar;
    }

    public final ConcurrentHashMap<String, CoverViewRootContainer> getMarkerInfoWindowRootContainerMap() {
        return this.n;
    }

    public final CoverViewWrapper a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c4968c25f782229b2841f6fbbbe4da", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c4968c25f782229b2841f6fbbbe4da");
        }
        CoverViewWrapper coverViewWrapper = null;
        String b = b(String.valueOf(i2));
        if (i2 != -1) {
            CoverViewRootContainer a2 = a(String.valueOf(b));
            if (a2 != null) {
                return com.meituan.msc.modules.page.view.e.a(a2, i);
            }
            return null;
        }
        for (Map.Entry<String, CoverViewRootContainer> entry : getMarkerInfoWindowRootContainerMap().entrySet()) {
            coverViewWrapper = com.meituan.msc.modules.page.view.e.a(entry.getValue(), i);
            if (coverViewWrapper != null) {
                return coverViewWrapper;
            }
        }
        return coverViewWrapper;
    }

    public final CoverViewRootContainer a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572d57885b15c2525cbf200ecce48811", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572d57885b15c2525cbf200ecce48811");
        }
        for (Map.Entry<String, CoverViewRootContainer> entry : getMarkerInfoWindowRootContainerMap().entrySet()) {
            if (com.meituan.msc.modules.page.view.e.a(entry.getValue(), i) != null) {
                return entry.getValue();
            }
        }
        return null;
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779c1dedb7df662b6ee1a3d8a92c27da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779c1dedb7df662b6ee1a3d8a92c27da");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<String, List<String>> entry : getMarkerViewIdsMap().entrySet()) {
            List<String> value = entry.getValue();
            if (value != null && value.contains(str)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final ConcurrentHashMap<String, List<String>> getMarkerViewIdsMap() {
        return this.c;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2118f11569bd7403f1100d4ea59b6b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2118f11569bd7403f1100d4ea59b6b55");
        } else if (this.j == null || this.b == null) {
        } else {
            this.j.removeView(this.b.b());
        }
    }
}
