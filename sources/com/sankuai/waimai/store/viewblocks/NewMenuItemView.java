package com.sankuai.waimai.store.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewMenuItemView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;
    private ImageView d;
    private TextView e;

    public NewMenuItemView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475acf96cf6aa9a5e07d868d222fcde8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475acf96cf6aa9a5e07d868d222fcde8");
        } else {
            a(context);
        }
    }

    public NewMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2923a113652cb37e4d82410b365f2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2923a113652cb37e4d82410b365f2c");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2910b732820f3d20b7d2217621e78b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2910b732820f3d20b7d2217621e78b");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_sc_channel_title_bar_menu_item, this);
        this.b = (ImageView) findViewById(R.id.menu_icon);
        this.c = (TextView) findViewById(R.id.menu_name);
        this.d = (ImageView) findViewById(R.id.red_point);
        this.e = (TextView) findViewById(R.id.unread_message_count);
    }

    public void setMenuIcon(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531f56c17cbf4a5547b02dae99284a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531f56c17cbf4a5547b02dae99284a7b");
        } else {
            this.b.setImageResource(i);
        }
    }

    public void setMenuName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9fb020f21b9922d874ad9391c80c4c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9fb020f21b9922d874ad9391c80c4c7");
        } else {
            this.c.setText(i);
        }
    }

    public void setMenuName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea22f7f07c31480756cf2e727fea215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea22f7f07c31480756cf2e727fea215");
        } else {
            this.c.setText(str);
        }
    }

    public void setRedPointVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c7fbec980370ba4baece93bed77cb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c7fbec980370ba4baece93bed77cb7b");
        } else {
            this.d.setVisibility(z ? 0 : 8);
        }
    }

    public void setUnreadMessageCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d04c4a92b27e6af44dec2a935603dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d04c4a92b27e6af44dec2a935603dc");
            return;
        }
        this.e.setVisibility(i <= 0 ? 8 : 0);
        this.e.setText(i > 99 ? "99+" : String.valueOf(i));
    }
}
