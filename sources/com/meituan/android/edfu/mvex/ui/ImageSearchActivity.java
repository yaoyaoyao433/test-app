package com.meituan.android.edfu.mvex.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.widget.FrameLayout;
import com.google.gson.GsonBuilder;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.edfu.mvex.detectors.b;
import com.meituan.android.edfu.mvex.detectors.c;
import com.meituan.android.edfu.mvex.interfaces.a;
import com.meituan.android.edfu.mvex.netservice.c;
import com.meituan.android.edfu.mvex.netservice.d;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.BaseResult;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.Config;
import com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity;
import com.meituan.android.edfu.mvex.ui.widget.a;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.platform.utils.f;
import java.util.Map;
import rx.e;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ImageSearchActivity extends BaseSearchActivity {
    public static ChangeQuickRedirect a = null;
    private static final String g = "ImageSearchActivity";
    private a h;
    private b i;
    private a.InterfaceC0253a j;
    private int k;
    private k l;

    public ImageSearchActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca2b667070fb0e6550baa9cafdfe0e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca2b667070fb0e6550baa9cafdfe0e9");
            return;
        }
        this.j = new a.InterfaceC0253a() { // from class: com.meituan.android.edfu.mvex.ui.ImageSearchActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.edfu.mvex.interfaces.a.InterfaceC0253a
            public final void a(c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e2b740b06d7bf4780bb97e92a2a3c85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e2b740b06d7bf4780bb97e92a2a3c85");
                    return;
                }
                ImageSearchActivity.this.d();
                ImageSearchActivity.a(ImageSearchActivity.this, cVar);
            }

            @Override // com.meituan.android.edfu.mvex.interfaces.a.InterfaceC0253a
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ff7397fef174394392b10751bc00b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ff7397fef174394392b10751bc00b5");
                } else {
                    ImageSearchActivity.b(ImageSearchActivity.this);
                }
            }

            @Override // com.meituan.android.edfu.mvex.interfaces.a.InterfaceC0253a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b37e2ea77ece1b012dc64db2810993f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b37e2ea77ece1b012dc64db2810993f");
                } else {
                    ImageSearchActivity.b(ImageSearchActivity.this);
                }
            }
        };
        this.k = 1;
    }

    public static /* synthetic */ void a(ImageSearchActivity imageSearchActivity, c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageSearchActivity, changeQuickRedirect, false, "51daa5c06e4f2cbd2529a4c8f8bb6aee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageSearchActivity, changeQuickRedirect, false, "51daa5c06e4f2cbd2529a4c8f8bb6aee");
            return;
        }
        Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(imageSearchActivity), "b_group_g71hqlpe_mc", (Map<String, Object>) null, "c_group_rtj4cvhh");
        if (cVar == null || cVar.b == 0 || cVar.a != 1) {
            return;
        }
        String json = new GsonBuilder().create().toJson(cVar.b);
        com.meituan.android.edfu.mvex.detectors.c a2 = com.meituan.android.edfu.mvex.detectors.c.a();
        Object[] objArr2 = {json};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.mvex.detectors.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ff171120a60df5f1f9bb687ae3995972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ff171120a60df5f1f9bb687ae3995972");
        } else if (!CollectionUtils.isEmpty(a2.b)) {
            for (c.a aVar : a2.b) {
                aVar.a(json);
            }
        }
        imageSearchActivity.finish();
        new StringBuilder("GET RESUT IS: ").append(json);
    }

    public static /* synthetic */ void b(ImageSearchActivity imageSearchActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageSearchActivity, changeQuickRedirect, false, "ded35d2874076b9666ffc385e6327361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageSearchActivity, changeQuickRedirect, false, "ded35d2874076b9666ffc385e6327361");
            return;
        }
        Statistics.getChannel("group").writeModelView(AppUtil.generatePageInfoKey(imageSearchActivity), "b_group_19vb7i68_mv", (Map<String, Object>) null, "c_group_rtj4cvhh");
        if (imageSearchActivity.h != null) {
            imageSearchActivity.h.a(2);
            imageSearchActivity.h.setVisibility(0);
        }
    }

    public static /* synthetic */ void e(ImageSearchActivity imageSearchActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageSearchActivity, changeQuickRedirect, false, "15b734f2493e842636d15555844b07f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageSearchActivity, changeQuickRedirect, false, "15b734f2493e842636d15555844b07f4");
            return;
        }
        q a2 = q.a(imageSearchActivity.getApplicationContext(), com.meituan.android.edfu.mvex.constants.a.a);
        if (a2.b(com.meituan.android.edfu.mvex.constants.a.b, true)) {
            imageSearchActivity.h.a(1);
            imageSearchActivity.h.setVisibility(0);
            a2.a(com.meituan.android.edfu.mvex.constants.a.b, false);
            imageSearchActivity.f.postDelayed(new Runnable() { // from class: com.meituan.android.edfu.mvex.ui.ImageSearchActivity.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "151f31e0745fac0dfbca769a1b4335af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "151f31e0745fac0dfbca769a1b4335af");
                    } else if (!ImageSearchActivity.this.isFinishing() && ImageSearchActivity.this.h.getVisibility() == 0) {
                        ImageSearchActivity.this.h.setVisibility(8);
                    }
                }
            }, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.meituan.android.edfu.mvex.interfaces.a dVar;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0058061dfdae6ec22117fbdc8a3e6670", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0058061dfdae6ec22117fbdc8a3e6670");
            return;
        }
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        d.a(getApplicationContext());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "500155f2fd79998a10c6756d77877613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "500155f2fd79998a10c6756d77877613");
        } else {
            int a2 = f.a(getIntent(), "searchtype", 0);
            if (a2 > 0 && a2 < 2) {
                this.k = a2;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d8b5faa5e0ef8203253c2566e681bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d8b5faa5e0ef8203253c2566e681bc6");
        } else {
            this.h = new com.meituan.android.edfu.mvex.ui.widget.a(this);
            this.h.setStateViewListener(new a.InterfaceC0256a() { // from class: com.meituan.android.edfu.mvex.ui.ImageSearchActivity.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.edfu.mvex.ui.widget.a.InterfaceC0256a
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "584a525402107e748d99407d56b7d537", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "584a525402107e748d99407d56b7d537");
                    } else {
                        ImageSearchActivity.this.d();
                    }
                }
            });
            new FrameLayout.LayoutParams(-1, -1).gravity = 17;
            this.h.setVisibility(8);
            this.e.addView(this.h);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c5afae0e5bf39dbfb7cd8691e7730df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c5afae0e5bf39dbfb7cd8691e7730df");
        } else {
            this.i = new b(getApplicationContext());
            this.i.e = this.j;
            b bVar = this.i;
            int i = this.k;
            Object[] objArr5 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect5 = b.a;
            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "7b3e98bc22b8b2b8cf3f47d4195f57b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "7b3e98bc22b8b2b8cf3f47d4195f57b7");
            } else {
                Context context = bVar.c;
                Object[] objArr6 = {Integer.valueOf(i), context};
                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.edfu.mvex.detectors.a.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "2d8ec244ec7cd42e7deac3f2fc7365b7", RobustBitConfig.DEFAULT_VALUE)) {
                    dVar = (com.meituan.android.edfu.mvex.interfaces.a) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "2d8ec244ec7cd42e7deac3f2fc7365b7");
                } else {
                    dVar = i != 1 ? null : new com.meituan.android.edfu.mvex.detectors.d(context);
                }
                dVar.a(bVar.f);
                bVar.b.put(Integer.valueOf(i), dVar);
                bVar.d = i;
            }
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(this);
        Statistics.disableAutoPV(generatePageInfoKey);
        Statistics.disableAutoPD(generatePageInfoKey);
        Statistics.getChannel("group").writePageView(generatePageInfoKey, "c_group_rtj4cvhh", null);
        Statistics.getChannel("group").writeModelView(generatePageInfoKey, "b_group_97puim7t_mv", (Map<String, Object>) null, "c_group_rtj4cvhh");
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c4b0a89c8c8941d30f493fa7f4f4a142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c4b0a89c8c8941d30f493fa7f4f4a142");
        } else {
            this.l = d.a().a(new e<BaseResult<Config>>() { // from class: com.meituan.android.edfu.mvex.ui.ImageSearchActivity.4
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(BaseResult<Config> baseResult) {
                    BaseResult<Config> baseResult2 = baseResult;
                    Object[] objArr8 = {baseResult2};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "e1907eabd7e420648415bf74159c3be2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "e1907eabd7e420648415bf74159c3be2");
                        return;
                    }
                    if (baseResult2.getCode() == 0) {
                        Config result = baseResult2.getResult();
                        if (result != null) {
                            ImageSearchActivity.this.h.a(result.getTitleText(), result.getSubTitleText(), result.getUrl());
                        } else {
                            ImageSearchActivity.this.h.a(ImageSearchActivity.this.getString(R.string.mvex_search_tips_title), ImageSearchActivity.this.getString(R.string.mvex_search_tips), com.meituan.android.edfu.mvex.constants.a.c);
                        }
                    } else {
                        ImageSearchActivity.this.h.a(ImageSearchActivity.this.getString(R.string.mvex_search_tips_title), ImageSearchActivity.this.getString(R.string.mvex_search_tips), com.meituan.android.edfu.mvex.constants.a.c);
                    }
                    ImageSearchActivity.e(ImageSearchActivity.this);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr8 = {th};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "593126b03229d5fb31e6f05775608110", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "593126b03229d5fb31e6f05775608110");
                        return;
                    }
                    if (ImageSearchActivity.this.h != null) {
                        ImageSearchActivity.this.h.a(ImageSearchActivity.this.getString(R.string.mvex_search_tips_title), ImageSearchActivity.this.getString(R.string.mvex_search_tips), com.meituan.android.edfu.mvex.constants.a.c);
                    }
                    ImageSearchActivity.e(ImageSearchActivity.this);
                }
            });
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572475131a2bc7dec7792570ee72840a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572475131a2bc7dec7792570ee72840a");
        } else {
            super.onResume();
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f0d2dbb36861af0f13651f2def4a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f0d2dbb36861af0f13651f2def4a1c");
        } else {
            super.onPause();
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7ec32c8b79b3f6b10c64eac3d8e791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7ec32c8b79b3f6b10c64eac3d8e791");
            return;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1b8bda0d6ebb8f0e52643db56a0cbe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1b8bda0d6ebb8f0e52643db56a0cbe3");
        } else if (this.i != null) {
            b bVar = this.i;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e998f35da7e1f57b63e84b2453d86512", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e998f35da7e1f57b63e84b2453d86512");
            } else {
                com.meituan.android.edfu.mvex.interfaces.a aVar = bVar.b.get(Integer.valueOf(bVar.d));
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
        Statistics.getChannel("group").writePageDisappear(AppUtil.generatePageInfoKey(this), "c_group_rtj4cvhh", null);
        if (this.l == null || this.l.isUnsubscribed()) {
            return;
        }
        this.l.unsubscribe();
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f902e7d28b30aed610276e7bde04610b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f902e7d28b30aed610276e7bde04610b");
            return;
        }
        super.a(bArr);
        if (this.i != null) {
            b bVar = this.i;
            Object[] objArr2 = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ca3d73f0f805e4eefebe1ae41eca45f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ca3d73f0f805e4eefebe1ae41eca45f8");
            } else if (bVar.a() != null) {
                bVar.a().a(bArr);
            }
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity, com.meituan.android.edfu.mvex.ui.widget.TitleView.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b323cf5e507e4c37a4c23407bd6e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b323cf5e507e4c37a4c23407bd6e54");
            return;
        }
        super.a();
        if (this.h != null) {
            this.h.a(1);
            this.h.setVisibility(0);
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789a80d404f1a3466af46d216c5625c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789a80d404f1a3466af46d216c5625c2");
        } else {
            super.a(i);
        }
    }

    @Override // com.meituan.android.edfu.mvex.ui.base.BaseSearchActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af20f42418258ad7658b920fc44fe4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af20f42418258ad7658b920fc44fe4c");
            return;
        }
        super.b();
        b bVar = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0440e9ca4baf08c4ec68a86dc166e542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0440e9ca4baf08c4ec68a86dc166e542");
            return;
        }
        com.meituan.android.edfu.mvex.interfaces.a aVar = bVar.b.get(Integer.valueOf(bVar.d));
        if (aVar != null) {
            aVar.a();
        }
    }
}
