package com.meituan.android.legwork.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.legwork.utils.l;
import com.meituan.android.legwork.utils.n;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.imui.session.view.adapter.ILocationMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IMLocationMsgAdapter extends BaseMsgAdapter implements ILocationMsgAdapter {
    public static ChangeQuickRedirect a;
    private Context b;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class GpsExtension implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("poi_address")
        public String poiAddress;
        @SerializedName("view_url")
        public String viewUrl;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, com.sankuai.xm.imui.session.entity.b<GPSMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b226ed5692d7da20f65bdee25a815ce1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b226ed5692d7da20f65bdee25a815ce1");
        }
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.legwork_im_gps_msg, viewGroup, false);
        inflate.setTag(new a(inflate));
        return inflate;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, com.sankuai.xm.imui.session.entity.b<GPSMessage> bVar) {
        GpsExtension gpsExtension;
        String format;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a643fbd07f04f74f13a18d40fb3c9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a643fbd07f04f74f13a18d40fb3c9f");
            return;
        }
        final a aVar = (a) view.getTag();
        GPSMessage a2 = bVar.a();
        String extension = a2.getExtension();
        if (TextUtils.isEmpty(extension)) {
            return;
        }
        try {
            gpsExtension = (GpsExtension) new Gson().fromJson(extension, (Class<Object>) GpsExtension.class);
        } catch (Exception e) {
            x.e("IMLocationMsgAdapter.bindView()", "parse im extension error,extensions:" + extension + ",exception msg:", e);
            x.a(e);
            gpsExtension = null;
        }
        if (gpsExtension == null) {
            return;
        }
        if (!TextUtils.isEmpty(gpsExtension.poiAddress)) {
            aVar.b.setVisibility(0);
            aVar.b.setText(gpsExtension.poiAddress);
        } else {
            aVar.b.setVisibility(8);
        }
        aVar.a.setText(!TextUtils.isEmpty(a2.getName()) ? a2.getName() : "位置信息");
        if (TextUtils.isEmpty(gpsExtension.viewUrl) || !gpsExtension.viewUrl.startsWith("http")) {
            return;
        }
        double longitude = a2.getLongitude();
        double latitude = a2.getLatitude();
        Object[] objArr2 = {464, Integer.valueOf((int) ShortcutUtils.SHORTCUT_TYPE_ENABLE), Double.valueOf(longitude), Double.valueOf(latitude)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9060f0c5332c936c8b43b8e8f9a43391", RobustBitConfig.DEFAULT_VALUE)) {
            format = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9060f0c5332c936c8b43b8e8f9a43391");
        } else {
            com.meituan.android.legwork.common.util.h.a();
            format = String.format("https://maf.meituan.com/tile/static_map?zoom=14&markers=-1,%s,0:%s,%s&size=%s*%s&key=%s", Uri.encode("http://p0.meituan.net/paotui/k74ecubisw.png"), Double.valueOf(longitude), Double.valueOf(latitude), 464, Integer.valueOf((int) ShortcutUtils.SHORTCUT_TYPE_ENABLE), com.meituan.android.legwork.common.util.h.b());
        }
        Picasso.g(this.b).d(format).a(aVar.c, new Callback() { // from class: com.meituan.android.legwork.ui.adapter.IMLocationMsgAdapter.1
            public static ChangeQuickRedirect a;

            @Override // com.squareup.picasso.Callback
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6cf1e872c86cc0191e51e4789c8903b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6cf1e872c86cc0191e51e4789c8903b");
                    return;
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("status", "success");
                q.a("legwork_im_map_gaode", 2, hashMap);
            }

            @Override // com.squareup.picasso.Callback
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5bc44f44f8db8b8547a8ee2a346be0c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5bc44f44f8db8b8547a8ee2a346be0c3");
                    return;
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("status", "fail");
                q.a("legwork_im_map_gaode", 2, hashMap);
                Picasso.g(IMLocationMsgAdapter.this.b).d("http://p0.meituan.net/scarlett/c8cc10353c91550a396bb0472d7665a11791.png").a(aVar.c);
            }
        });
        view.setOnClickListener(g.a(this, gpsExtension.viewUrl));
    }

    public static /* synthetic */ void a(IMLocationMsgAdapter iMLocationMsgAdapter, String str, View view) {
        Object[] objArr = {iMLocationMsgAdapter, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4265c2ad155fc29437c0a111b3f9add6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4265c2ad155fc29437c0a111b3f9add6");
        } else if (iMLocationMsgAdapter.b == null || !(iMLocationMsgAdapter.b instanceof Activity)) {
        } else {
            Activity activity = (Activity) iMLocationMsgAdapter.b;
            Object[] objArr2 = {activity, str};
            ChangeQuickRedirect changeQuickRedirect2 = n.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8466f3f536540f8641ddeb992993cf1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8466f3f536540f8641ddeb992993cf1c");
            } else {
                l.a(activity, str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a {
        public TextView a;
        public TextView b;
        public ImageView c;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.gps_message_poi_name);
            this.b = (TextView) view.findViewById(R.id.gps_message_poi_address);
            this.c = (ImageView) view.findViewById(R.id.gps_message_poi_image);
        }
    }
}
