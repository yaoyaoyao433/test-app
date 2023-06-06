package com.sankuai.waimai.store.viewblocks;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends MenuItemView {
    public static ChangeQuickRedirect j;
    private View k;

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d08d50fe821fd61156524b3083db0c72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d08d50fe821fd61156524b3083db0c72");
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.MenuItemView
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14b62757a14acc7c3a74ad7bd4fdadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14b62757a14acc7c3a74ad7bd4fdadc");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_sg_home_right_menu_item, this);
        this.c = (ImageView) findViewById(R.id.menu_icon);
        this.d = (TextView) findViewById(R.id.menu_name);
        this.e = (ImageView) findViewById(R.id.red_point);
        this.f = (TextView) findViewById(R.id.unread_message_count);
        this.g = (TextView) findViewById(R.id.home_search_unread_message_count);
        this.k = findViewById(R.id.top_line);
    }

    public final void setHasTopLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9465e10c279f003e412c5d598785d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9465e10c279f003e412c5d598785d69");
        } else if (this.k != null) {
            this.k.setVisibility(z ? 0 : 8);
        }
    }
}
