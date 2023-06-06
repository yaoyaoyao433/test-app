package com.sankuai.waimai.platform.shop.channellabel;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.c;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.tencent.mapsdk.internal.y;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ChannelLabelController {
    public static ChangeQuickRedirect a;
    private static final Map<String, a> c;
    Activity b;
    private View d;
    private TextView e;
    private View f;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ActivityType {
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("snssdk143", new a(R.string.wm_channel_label_text_back_to_toutiao, "com.ss.android.article.news"));
        c.put("snssdk35", new a(R.string.wm_channel_label_text_back_to_toutiao_lite, "com.ss.android.article.lite"));
        c.put("snssdk32", new a(R.string.wm_channel_label_text_back_to_xigua, "com.ss.android.article.video"));
        c.put("snssdk1128", new a(R.string.wm_channel_label_text_back_to_douyin, "com.ss.android.ugc.aweme"));
        c.put("snssdk1112", new a(R.string.wm_channel_label_text_back_to_huoshan, "com.ss.android.ugc.live"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static final a b = new a(R.string.wm_channel_label_text_back, null);
        @StringRes
        private int c;
        @Nullable
        private String d;

        private a(@StringRes int i, @Nullable String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904fb4e72bc2ebbd230b112af5a548b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904fb4e72bc2ebbd230b112af5a548b2");
                return;
            }
            this.c = i;
            this.d = str;
        }
    }

    public ChannelLabelController(Activity activity, ViewStub viewStub) {
        Object[] objArr = {activity, viewStub};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6f50402f4db9337bea7bd69d2ca0ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6f50402f4db9337bea7bd69d2ca0ed");
            return;
        }
        this.b = activity;
        this.d = viewStub.inflate();
        this.d.setVisibility(8);
        this.e = (TextView) this.d.findViewById(R.id.txt_channel_name);
    }

    public ChannelLabelController(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6444443fc23d8891fc9339381203bae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6444443fc23d8891fc9339381203bae4");
        } else if (view == null) {
        } else {
            this.b = activity;
            this.d = view;
            this.d.setVisibility(8);
            this.e = (TextView) this.d.findViewById(R.id.txt_channel_name);
        }
    }

    public static void a(int i, com.sankuai.waimai.platform.domain.core.channel.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "288cf6168446b152a691141b73893142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "288cf6168446b152a691141b73893142");
        } else if (i == 0) {
            a("b_05PvR", aVar);
        } else if (i == 1) {
            a("b_i5qqk", aVar);
        } else if (i == 2) {
            a("b_f9C4j", aVar);
        }
    }

    private static void a(String str, com.sankuai.waimai.platform.domain.core.channel.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5614de4783d38d0739c24b75cf7bda07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5614de4783d38d0739c24b75cf7bda07");
        } else if (TextUtils.isEmpty(str) || aVar == null) {
        } else {
            JudasManualManager.a(str).a("ys", aVar.b).a("ys_id", aVar.c).a("activity_id", aVar.d).a("restaurant_id", aVar.g).a();
        }
    }

    @Nullable
    private a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec60da2d79543289f9a2c8236b06afc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec60da2d79543289f9a2c8236b06afc7");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a aVar = c.get(str);
        return aVar == null ? a.b : aVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3775c92d6acbaefb454e5433aff138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3775c92d6acbaefb454e5433aff138");
        } else {
            b();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e674b82ae32b31f1cb84f0b5a720cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e674b82ae32b31f1cb84f0b5a720cc0");
        } else if (this.d != null) {
            this.d.setVisibility(8);
        }
    }

    public final void a(final com.sankuai.waimai.platform.domain.core.channel.a aVar, final int i) {
        String str;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23cf449b1f82b76294415fdc1bfb895b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23cf449b1f82b76294415fdc1bfb895b");
        } else if (aVar == null || TextUtils.isEmpty(aVar.f)) {
            this.d.setVisibility(8);
        } else {
            String str2 = null;
            try {
                str2 = URLDecoder.decode(aVar.f, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
            if (TextUtils.isEmpty(str2)) {
                this.d.setVisibility(8);
                return;
            }
            final Uri parse = Uri.parse(str2);
            final a a2 = a(parse.getScheme());
            if (parse.equals(Uri.EMPTY) || a2 == null) {
                return;
            }
            this.f = this.d.findViewById(R.id.channel_close_btn);
            if (TextUtils.isEmpty(aVar.e)) {
                str = this.b.getString(a2.c);
            } else {
                str = this.b.getString(R.string.wm_channel_label_text_back) + aVar.e;
            }
            if (str2 != null && str2.startsWith("baiduboxapp")) {
                str = "百度APP";
                final ImageView imageView = (ImageView) this.d.findViewById(R.id.iv_channel_back_icon);
                if (imageView != null) {
                    c.a(imageView.getContext(), "waimai_c_icon_third_ad_channel_back", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.roodesign.resfetcher.runtime.b
                        public final void a(Drawable drawable, boolean z) {
                            Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f24f7a8bd8c2b3d5bad1abf889f5e21", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f24f7a8bd8c2b3d5bad1abf889f5e21");
                                return;
                            }
                            imageView.setImageDrawable(drawable);
                            imageView.setPadding(0, 0, 0, 0);
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                            layoutParams.rightMargin = 0;
                            imageView.setLayoutParams(layoutParams);
                        }
                    });
                }
                ImageView imageView2 = (ImageView) this.d.findViewById(R.id.iv_channel_app_icon);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                if (this.f != null) {
                    this.f.setVisibility(8);
                }
                this.e.setTextColor(-1);
                this.d.setBackgroundResource(R.drawable.wm_restaurant_channel_label_blue_bg);
            }
            this.d.setVisibility(0);
            this.e.setText(str);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bba1e11f0a0fc7c165fcf97dc2430361", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bba1e11f0a0fc7c165fcf97dc2430361");
                        return;
                    }
                    try {
                        ChannelLabelController.a(i, aVar);
                        Intent intent = new Intent();
                        intent.setPackage(a2.d);
                        intent.setData(parse);
                        intent.addFlags(y.a);
                        if (intent.resolveActivityInfo(ChannelLabelController.this.b.getPackageManager(), 65536) != null) {
                            ChannelLabelController.this.b.startActivity(intent);
                        }
                    } catch (ActivityNotFoundException | SecurityException unused2) {
                        ae.a(ChannelLabelController.this.b, (int) R.string.wm_platform_channel_label_start_activity_error_tip);
                    }
                }
            });
            if (this.f == null) {
                return;
            }
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0528ab8d426dbcabaa9244ee90398052", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0528ab8d426dbcabaa9244ee90398052");
                    } else {
                        ChannelLabelController.this.b();
                    }
                }
            });
        }
    }
}
