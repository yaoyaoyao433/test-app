package com.sankuai.waimai.kit.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.AppBean;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.utils.e;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    @NonNull
    public final Context c;
    public int d;
    public ShareBean e;
    public String f;
    public String g;
    public Dialog h;
    public List<AppBean> i;
    public TextView j;
    public ImageView k;
    private final int l;
    @NonNull
    private final b m;
    private final com.sankuai.waimai.kit.share.listener.a n;
    private boolean o;

    public a(@NonNull Context context, @NonNull b bVar, @NonNull com.sankuai.waimai.kit.share.listener.a aVar, int i) {
        AppBean a2;
        AppBean a3;
        Object[] objArr = {context, bVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea65a874fe6afa6e4495a35f56acc60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea65a874fe6afa6e4495a35f56acc60");
            return;
        }
        this.o = false;
        this.c = context;
        this.n = aVar;
        this.m = bVar;
        this.l = i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8beb93fd658e5d75c8757e93eaa4ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8beb93fd658e5d75c8757e93eaa4ed7");
            return;
        }
        this.i = new ArrayList();
        if (this.m.a()) {
            if ((this.l & 4) > 0) {
                this.i.add(new AppBean(4, R.drawable.wm_share_weixin_circle_logo));
            }
            if ((this.l & 2) > 0) {
                this.i.add(new AppBean(2, R.drawable.wm_share_weixin_friends_logo));
            }
        }
        if (((this.l & 8) > 0) && (a3 = a(8)) != null) {
            this.i.add(a3);
        }
        if (!((this.l & 1) > 0) || (a2 = a(1)) == null) {
            return;
        }
        this.i.add(a2);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [android.widget.Adapter] */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Activity activity;
        boolean z = false;
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d09fd866b14162050fd142ba1185e401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d09fd866b14162050fd142ba1185e401");
            return;
        }
        com.sankuai.waimai.kit.share.dialog.a.a(this.h);
        NetworkInfo networkInfo = null;
        if (this.c instanceof Activity) {
            activity = (Activity) this.c;
        } else {
            b bVar = this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "66dc1d5daa2a73aa15ca7a12244004f4", RobustBitConfig.DEFAULT_VALUE)) {
                activity = (Activity) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "66dc1d5daa2a73aa15ca7a12244004f4");
            } else {
                activity = bVar.d == null ? null : bVar.d.get();
            }
        }
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.kit.share.util.d.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cf9c1d01feab7c934a58b4c37064c650", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cf9c1d01feab7c934a58b4c37064c650")).booleanValue();
        } else {
            Object[] objArr4 = {context};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.kit.share.util.d.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b1452ec040bfaebd5e3a1059086c4a7d", RobustBitConfig.DEFAULT_VALUE)) {
                networkInfo = (NetworkInfo) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b1452ec040bfaebd5e3a1059086c4a7d");
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                }
            }
            if (networkInfo != null && networkInfo.isAvailable()) {
                z = true;
            }
        }
        if (!z) {
            if (activity != null) {
                e.a(activity, com.meituan.android.singleton.b.a.getString(R.string.wm_share_please_connect_to_internet));
                return;
            }
            return;
        }
        AppBean appBean = (AppBean) adapterView.getAdapter().getItem(i);
        if (this.n == null || appBean == null) {
            return;
        }
        this.n.a(this.d, appBean.getId());
    }

    private AppBean a(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fab4a9427330695f74c29e00805263f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fab4a9427330695f74c29e00805263f");
        }
        if (i == 1) {
            i2 = R.drawable.wm_share_qzone_logo;
        } else if (i != 8) {
            i = 0;
            i2 = 0;
        } else {
            i2 = R.drawable.wm_share_qq_logo;
        }
        try {
            if (this.o) {
                return new AppBean(i, i2);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.c.getString(R.string.wm_share));
            intent.setFlags(y.a);
            for (ResolveInfo resolveInfo : this.c.getPackageManager().queryIntentActivities(intent, 0)) {
                if (TextUtils.equals("com.tencent.mobileqq", resolveInfo.activityInfo.packageName)) {
                    this.o = true;
                    return new AppBean(i, i2);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.kit.share.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0983a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        private Context c;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public C0983a(Context context) {
            Object[] objArr = {a.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090566e5fc852a71914b17f0e169ac2b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090566e5fc852a71914b17f0e169ac2b");
            } else {
                this.c = context;
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f6ed00281b8194728cc4803d56bafa", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f6ed00281b8194728cc4803d56bafa")).intValue();
            }
            if (a.this.i == null || a.this.i.isEmpty()) {
                return 0;
            }
            return a.this.i.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e926eb7c18289290b470278346123e27", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e926eb7c18289290b470278346123e27") : a.this.i.get(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3014b75c8b28f900eb75827c873f58c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3014b75c8b28f900eb75827c873f58c6");
            }
            if (view == null) {
                view = LayoutInflater.from(this.c).inflate(R.layout.wm_share_griditem_base_share, viewGroup, false);
            }
            ((TextView) view.findViewById(R.id.share_name)).setText(((AppBean) a.this.i.get(i)).getAppName());
            ((ImageView) view.findViewById(R.id.share_image)).setImageResource(((AppBean) a.this.i.get(i)).getAppIcon());
            return view;
        }
    }
}
