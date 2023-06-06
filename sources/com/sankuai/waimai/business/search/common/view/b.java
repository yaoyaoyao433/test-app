package com.sankuai.waimai.business.search.common.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends LinearLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;
    private View d;
    private final Context e;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11af7966c2f087cdd38f0f8addcaac04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11af7966c2f087cdd38f0f8addcaac04");
            return;
        }
        this.e = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee01dac3d15b38a38f95f80c1d1fd39c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee01dac3d15b38a38f95f80c1d1fd39c");
            return;
        }
        View inflate = View.inflate(this.e, R.layout.wm_nox_search_global_tag_textview, this);
        this.b = (ImageView) inflate.findViewById(R.id.takeout_search_tag_icon);
        this.c = (TextView) inflate.findViewById(R.id.takeout_search_tag_text);
        this.d = inflate.findViewById(R.id.takeout_search_tag_close);
    }

    public final void setCloseVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5b8518ce0a9fa950adbeaa25733ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5b8518ce0a9fa950adbeaa25733ba1");
        } else {
            this.d.setVisibility(i);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7f00ec53e167cb9bc85c460e97e505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7f00ec53e167cb9bc85c460e97e505");
        } else {
            this.c.setText(str);
        }
    }

    public final String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d315736fd55bb62f4d5fbb764f7cefc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d315736fd55bb62f4d5fbb764f7cefc") : this.c.getText() != null ? this.c.getText().toString() : "";
    }

    public final void b(String str) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd22bb73a741eb3be92134d60584fc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd22bb73a741eb3be92134d60584fc6a");
        } else if (TextUtils.isEmpty(null)) {
            this.b.setVisibility(8);
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.e;
            a2.c = null;
            a2.h = new b.c() { // from class: com.sankuai.waimai.business.search.common.view.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00e9e1ffad516b79a864fac40c70e56f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00e9e1ffad516b79a864fac40c70e56f");
                    } else {
                        b.this.b.setVisibility(0);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a48153f10ddf12cf85654a707077957e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a48153f10ddf12cf85654a707077957e");
                    } else {
                        b.this.b.setVisibility(8);
                    }
                }
            };
            a2.a(this.b);
        }
    }
}
