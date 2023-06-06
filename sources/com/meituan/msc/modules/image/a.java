package com.meituan.msc.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.d;
import com.meituan.msc.modules.manager.f;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoTarget;
import com.squareup.picasso.RequestListener;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = ImageLoaderModule.NAME)
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;
    final Object b;
    final SparseArray<PicassoTarget> c;
    private final q d;

    @MSCMethod
    public void getSizeWithHeaders(String str, JSONObject jSONObject, d dVar) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ff05fcfafbe7cd98a1e1cfbe0765cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ff05fcfafbe7cd98a1e1cfbe0765cb");
            return;
        }
        this.b = new Object();
        this.c = new SparseArray<>();
        this.d = new q() { // from class: com.meituan.msc.modules.image.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38c0352bd7e588e9fa884632a6fe3867", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38c0352bd7e588e9fa884632a6fe3867");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cc1686ca4efef5087cc1e1ae5d281144", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cc1686ca4efef5087cc1e1ae5d281144");
                    return;
                }
                synchronized (aVar.b) {
                    int size = aVar.c.size();
                    for (int i = 0; i < size; i++) {
                        PicassoTarget valueAt = aVar.c.valueAt(i);
                        if (valueAt != null) {
                            Picasso.a(valueAt);
                        }
                    }
                    aVar.c.clear();
                }
            }
        };
    }

    @MSCMethod
    public void getSize(String str, final d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f928e8aa88e8340f4c3f8912b1a125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f928e8aa88e8340f4c3f8912b1a125");
        } else if (str == null || str.isEmpty()) {
            dVar.a("E_INVALID_URI", new Exception("Cannot get the size of an image for an empty URI"));
        } else {
            Picasso.g(MSCEnvHelper.getContext()).a(Uri.parse(str)).a(DiskCacheStrategy.SOURCE).a(new RequestListener<Object, PicassoDrawable>() { // from class: com.meituan.msc.modules.image.a.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.RequestListener
                public final boolean a(Exception exc, Object obj, boolean z) {
                    Object[] objArr2 = {exc, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a1ca76583def4965feee7ed4e5ba365", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a1ca76583def4965feee7ed4e5ba365")).booleanValue();
                    }
                    dVar.a("E_GET_SIZE_FAILURE", new RuntimeException("fetch image exception", exc));
                    return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.squareup.picasso.RequestListener
                public boolean a(PicassoDrawable picassoDrawable, Object obj, boolean z, boolean z2) {
                    Object[] objArr2 = {picassoDrawable, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a511613cbe75d9d751eead71eba05214", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a511613cbe75d9d751eead71eba05214")).booleanValue();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("width", picassoDrawable.getIntrinsicWidth());
                        jSONObject.put("height", picassoDrawable.getIntrinsicHeight());
                        dVar.a(jSONObject);
                    } catch (Exception e) {
                        dVar.a("E_GET_SIZE_FAILURE", e);
                    }
                    return false;
                }
            }).d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @MSCMethod
    public void prefetchImage(String str, double d, final d dVar) {
        Object[] objArr = {str, Double.valueOf(d), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a7a28daa140f880662b782287915f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a7a28daa140f880662b782287915f0");
            return;
        }
        final int i = (int) d;
        if (str == null || str.isEmpty()) {
            dVar.a("E_INVALID_URI", new Exception("Cannot prefetch an image for an empty URI"));
            return;
        }
        final Uri parse = Uri.parse(str);
        PicassoTarget d2 = Picasso.g(MSCEnvHelper.getContext()).a(parse).a(true).a(DiskCacheStrategy.SOURCE).a(new RequestListener<Uri, PicassoDrawable>() { // from class: com.meituan.msc.modules.image.a.3
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.squareup.picasso.RequestListener
            public boolean a(Exception exc, Uri uri, boolean z) {
                Object[] objArr2 = {exc, uri, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19cecc0a2fbf539d60123a5641dad26b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19cecc0a2fbf539d60123a5641dad26b")).booleanValue();
                }
                try {
                    a.this.a(i);
                    dVar.a("E_PREFETCH_FAILURE", exc);
                } catch (Exception unused) {
                }
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.squareup.picasso.RequestListener
            public boolean a(PicassoDrawable picassoDrawable, Uri uri, boolean z, boolean z2) {
                Object[] objArr2 = {picassoDrawable, uri, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8fdd4969f1905d3f13ce5e7eb9882e7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8fdd4969f1905d3f13ce5e7eb9882e7")).booleanValue();
                }
                try {
                    a.this.a(i);
                    com.meituan.msc.views.imagehelper.d.a().a(parse);
                    dVar.a(Boolean.TRUE);
                } catch (Exception unused) {
                }
                return false;
            }
        }).d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Object[] objArr2 = {Integer.valueOf(i), d2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2e6faf14496350b11f85c2ce008b75e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2e6faf14496350b11f85c2ce008b75e");
            return;
        }
        synchronized (this.b) {
            this.c.put(i, d2);
        }
    }

    @MSCMethod
    public void abortRequest(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542ee92b529e249b88281bc5a73ecf61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542ee92b529e249b88281bc5a73ecf61");
            return;
        }
        PicassoTarget a2 = a((int) d);
        if (a2 != null) {
            Picasso.a(a2);
        }
    }

    @MSCMethod
    public void queryCache(final JSONArray jSONArray, final d dVar) {
        Object[] objArr = {jSONArray, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e093c3386da16b20b050bf4153534eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e093c3386da16b20b050bf4153534eea");
        } else {
            b.a(new AsyncTask<Void, Void, Void>() { // from class: com.meituan.msc.modules.image.a.4
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Void doInBackground(Void... voidArr) {
                    Object[] objArr2 = {voidArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a557f2c073ece37c3fa140e56b43ae31", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a557f2c073ece37c3fa140e56b43ae31");
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            jSONObject.put(jSONArray.getString(i), "disk");
                        }
                        dVar.a(jSONObject);
                        return null;
                    } catch (Throwable th) {
                        dVar.a(th.getMessage(), new Exception(th));
                        return null;
                    }
                }
            }, c.a(), new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PicassoTarget a(int i) {
        PicassoTarget picassoTarget;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a5d5f08636e71d53033f7f0c097cc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoTarget) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a5d5f08636e71d53033f7f0c097cc4");
        }
        synchronized (this.b) {
            picassoTarget = this.c.get(i);
            this.c.remove(i);
        }
        return picassoTarget;
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831f57f2856feb257f0506e121d8d048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831f57f2856feb257f0506e121d8d048");
            return;
        }
        super.a(hVar);
        U_().a("msc_event_container_destroyed", this.d);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a335e10e87fcb01f816eb4908088cca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a335e10e87fcb01f816eb4908088cca2");
            return;
        }
        super.L_();
        U_().a(this.d);
    }
}
