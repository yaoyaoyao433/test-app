package com.meituan.android.screenshot;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.base.util.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.edfu.mbar.util.d;
import com.meituan.android.screenshot.bean.ShortProtocol;
import com.meituan.android.screenshot.retrofit2.ScreenShotRetrofitService;
import com.meituan.retrofit2.androidadapter.CallLoaderCallbacks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareExtraInfo;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenShotFloatWindowActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private String c;
    private boolean d;
    private int e;
    private final List<AppBean> f;
    private ShareExtraInfo g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private Bitmap l;
    private String m;
    private View.OnClickListener n;

    public ScreenShotFloatWindowActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e27e158d6e6d3564d7acfea91b97006", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e27e158d6e6d3564d7acfea91b97006");
            return;
        }
        this.d = false;
        this.f = new CopyOnWriteArrayList();
        this.j = "";
        this.k = false;
        this.m = "https://m.dianping.com/cube/evoke/meituan.html?url=imeituan%3A%2F%2Fwww.meituan.com%2Fhome";
        this.n = new View.OnClickListener() { // from class: com.meituan.android.screenshot.ScreenShotFloatWindowActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d5822efbb7365a28211bd4916711057", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d5822efbb7365a28211bd4916711057");
                    return;
                }
                int id = view.getId();
                if ((id == R.id.screen_share_bg || id == R.id.screen_share_close_window) && !ScreenShotFloatWindowActivity.this.isFinishing()) {
                    ScreenShotFloatWindowActivity.this.finish();
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.screenshot.ScreenShotFloatWindowActivity r19, com.sankuai.android.share.bean.AppBean r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.screenshot.ScreenShotFloatWindowActivity.a(com.meituan.android.screenshot.ScreenShotFloatWindowActivity, com.sankuai.android.share.bean.AppBean):void");
    }

    public static /* synthetic */ boolean a(ScreenShotFloatWindowActivity screenShotFloatWindowActivity, boolean z) {
        screenShotFloatWindowActivity.k = true;
        return true;
    }

    public static /* synthetic */ int c(ScreenShotFloatWindowActivity screenShotFloatWindowActivity) {
        int i = screenShotFloatWindowActivity.e;
        screenShotFloatWindowActivity.e = i + 1;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x015b, code lost:
        if (r0 == false) goto L58;
     */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.screenshot.ScreenShotFloatWindowActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e41e5b758647191cb53fefdd5225a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e41e5b758647191cb53fefdd5225a12");
            return;
        }
        super.onResume();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69d506d8669fc2d35885bd31e43208ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69d506d8669fc2d35885bd31e43208ad");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("FW_URL", this.h);
        hashMap.put("class_nm", this.i);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom", hashMap);
        c.a aVar = new c.a("", hashMap2);
        aVar.event_type = Constants.EventType.VIEW;
        aVar.nm = EventName.PAGE_VIEW;
        aVar.b = 1;
        aVar.a(this, "c_group_6vjdynhf").a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements d.b {
        public static ChangeQuickRedirect a;
        public WeakReference<ScreenShotFloatWindowActivity> b;

        public a(ScreenShotFloatWindowActivity screenShotFloatWindowActivity) {
            Object[] objArr = {ScreenShotFloatWindowActivity.this, screenShotFloatWindowActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab929132d073416f89bfe0ed2071da0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab929132d073416f89bfe0ed2071da0c");
            } else {
                this.b = new WeakReference<>(screenShotFloatWindowActivity);
            }
        }

        @Override // com.meituan.android.edfu.mbar.util.d.b
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5598c6b2792625937c0995e5fb8bc47b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5598c6b2792625937c0995e5fb8bc47b");
                return;
            }
            ScreenShotFloatWindowActivity screenShotFloatWindowActivity = this.b.get();
            if (screenShotFloatWindowActivity == null || screenShotFloatWindowActivity.isFinishing() || TextUtils.isEmpty(str)) {
                return;
            }
            ScreenShotFloatWindowActivity.a(ScreenShotFloatWindowActivity.this, true);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class c extends CallLoaderCallbacks<ShortProtocol> {
        public static ChangeQuickRedirect a;
        private Context d;
        private ak e;

        @Override // com.meituan.retrofit2.androidadapter.CallLoaderCallbacks
        public final /* synthetic */ void a(Loader loader, ShortProtocol shortProtocol) {
            ShortProtocol shortProtocol2 = shortProtocol;
            Object[] objArr = {loader, shortProtocol2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a949f63dfe426254cd048d52062d97bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a949f63dfe426254cd048d52062d97bd");
            } else if (shortProtocol2 == null || shortProtocol2.code != 0 || TextUtils.isEmpty(shortProtocol2.data)) {
            } else {
                ScreenShotFloatWindowActivity.this.m = shortProtocol2.data;
            }
        }

        public c(Context context, ak akVar) {
            super(context);
            Object[] objArr = {ScreenShotFloatWindowActivity.this, context, akVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c697c7d24aef41b8b703932d06b2032c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c697c7d24aef41b8b703932d06b2032c");
                return;
            }
            this.d = context;
            this.e = akVar;
        }

        @Override // com.meituan.retrofit2.androidadapter.CallLoaderCallbacks
        public final Call<ShortProtocol> a(int i, Bundle bundle) {
            Object[] objArr = {Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0af4b9f2723989157e4e79401d8e425", RobustBitConfig.DEFAULT_VALUE)) {
                return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0af4b9f2723989157e4e79401d8e425");
            }
            com.meituan.android.screenshot.retrofit2.c a2 = com.meituan.android.screenshot.retrofit2.c.a(this.d);
            ak akVar = this.e;
            Object[] objArr2 = {akVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.screenshot.retrofit2.c.a;
            return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8c0a0d736314f7b9be02fb0968a2e9eb", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8c0a0d736314f7b9be02fb0968a2e9eb") : ((ScreenShotRetrofitService) a2.b.a(ScreenShotRetrofitService.class)).getShortProtocol(akVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b599c6489f2101cfa075b3527b4cae01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b599c6489f2101cfa075b3527b4cae01");
        } else {
            Picasso.g(this).a(Uri.fromFile(new File(str))).a(com.meituan.android.screenshot.utils.c.a(this, 230.0f), com.meituan.android.screenshot.utils.c.a(this, 393.0f)).a(new Target() { // from class: com.meituan.android.screenshot.ScreenShotFloatWindowActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3e1f07fc257afa70cbfd7f740fde415", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3e1f07fc257afa70cbfd7f740fde415");
                        return;
                    }
                    ScreenShotFloatWindowActivity.this.l = bitmap;
                    if (ScreenShotFloatWindowActivity.this.b != null) {
                        ScreenShotFloatWindowActivity.this.b.setImageBitmap(bitmap);
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e49dc3af6416665314d980d745db9c2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e49dc3af6416665314d980d745db9c2c");
                    } else if (ScreenShotFloatWindowActivity.this.e < 5) {
                        ScreenShotFloatWindowActivity.c(ScreenShotFloatWindowActivity.this);
                        ScreenShotFloatWindowActivity.this.b.postDelayed(new Runnable() { // from class: com.meituan.android.screenshot.ScreenShotFloatWindowActivity.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a39b7ad1ea8dbd32de584c227eca2ca0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a39b7ad1ea8dbd32de584c227eca2ca0");
                                } else if (ScreenShotFloatWindowActivity.this.d) {
                                    ScreenShotFloatWindowActivity.this.a(ScreenShotFloatWindowActivity.this.c);
                                }
                            }
                        }, 100L);
                    }
                }
            });
        }
    }

    private void a(Bitmap bitmap, String str) {
        Object[] objArr = {bitmap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9562cb8f743a8e094ff35fd4f87ef31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9562cb8f743a8e094ff35fd4f87ef31");
        } else if (bitmap == null || str == null) {
        } else {
            File file = new File(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends BaseAdapter {
        public static ChangeQuickRedirect a;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        private b() {
            Object[] objArr = {ScreenShotFloatWindowActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce939e9725b5c517aa6f997a65f2018", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce939e9725b5c517aa6f997a65f2018");
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286817602ba07767e593dd6414cc4b6a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286817602ba07767e593dd6414cc4b6a")).intValue() : ScreenShotFloatWindowActivity.this.f.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c700c4aee3d71299c6ccc44c1a36fba0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c700c4aee3d71299c6ccc44c1a36fba0") : ScreenShotFloatWindowActivity.this.f.get(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5fc5d16e5a5938dcf92de827c4c079d", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5fc5d16e5a5938dcf92de827c4c079d");
            }
            final AppBean appBean = null;
            if (view == null) {
                view = LayoutInflater.from(ScreenShotFloatWindowActivity.this).inflate(R.layout.screen_share_item, (ViewGroup) null);
                aVar = new a();
                aVar.a = (ImageView) view.findViewById(R.id.screen_share_image);
                aVar.b = (TextView) view.findViewById(R.id.screen_share_name);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67d3f579491ab5125bc658724a99e528", RobustBitConfig.DEFAULT_VALUE)) {
                appBean = (AppBean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67d3f579491ab5125bc658724a99e528");
            } else if (i >= 0 && i < getCount()) {
                appBean = (AppBean) ScreenShotFloatWindowActivity.this.f.get(i);
            }
            if (appBean != null) {
                if (appBean.getIcon() != null) {
                    aVar.a.setImageDrawable(appBean.getIcon());
                } else {
                    aVar.a.setImageResource(appBean.getAppIcon());
                }
                aVar.b.setText(appBean.getAppName());
                aVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.screenshot.ScreenShotFloatWindowActivity.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb85e1b362c1795979ec1f638dc998cb", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb85e1b362c1795979ec1f638dc998cb");
                        } else {
                            ScreenShotFloatWindowActivity.a(ScreenShotFloatWindowActivity.this, appBean);
                        }
                    }
                });
            }
            return view;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        class a {
            public ImageView a;
            public TextView b;

            private a() {
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91dcced00a66407daa2a2468a3cc42ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91dcced00a66407daa2a2468a3cc42ae");
            return;
        }
        overridePendingTransition(0, R.anim.activity_slide_exit);
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2a337d33c3cc2a21ccecdb24924dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2a337d33c3cc2a21ccecdb24924dc8");
            return;
        }
        super.onStop();
        this.d = false;
    }
}
