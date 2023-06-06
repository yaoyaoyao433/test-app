package com.sankuai.waimai.business.im.group.View;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.platform.capacity.imageloader.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class WmGroupChatMemberView extends FrameLayout {
    public static ChangeQuickRedirect b;
    private ImageView a;
    protected Drawable c;
    private TextView d;

    public abstract int getDefaultDrawable();

    public WmGroupChatMemberView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aed23f1e7fb3ff81c3383b3f2db0a5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aed23f1e7fb3ff81c3383b3f2db0a5c");
        }
    }

    public WmGroupChatMemberView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b81d81dbbeb4c236e735ec61d5d7fb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b81d81dbbeb4c236e735ec61d5d7fb2");
        }
    }

    public WmGroupChatMemberView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5cb9bbf22777cdc0120152740981b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5cb9bbf22777cdc0120152740981b0");
        } else {
            a(context, attributeSet);
        }
    }

    public void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1004eb4e88e924a981b59f13697892a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1004eb4e88e924a981b59f13697892a8");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_im_group_titlebar_avatar_layout, this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75cc9d52fffe8949d7bd32e62ce372ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75cc9d52fffe8949d7bd32e62ce372ff");
            return;
        }
        this.a = (ImageView) findViewById(R.id.wm_im_group_iv_avatar);
        this.d = (TextView) findViewById(R.id.wm_im_group_tv_name);
        this.a.setImageResource(getDefaultDrawable());
    }

    public void setShadowForeground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc999e2a9a490da5baa23b4e0292ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc999e2a9a490da5baa23b4e0292ae9");
            return;
        }
        this.c = drawable;
        if (this.c != null) {
            this.d.setBackground(this.c);
        }
    }

    public void setMemberAvatar(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35bb77ceb0944b18c78781c8f49c83f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35bb77ceb0944b18c78781c8f49c83f5");
            return;
        }
        b.C0608b a = a.a();
        a.b = getContext();
        a.c = str;
        a.e = 1;
        a.f = ImageQualityUtil.b();
        a.i = getDefaultDrawable();
        a.j = getDefaultDrawable();
        a.a(this.a);
    }

    public void setMemberName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e1b147d046199545269b2a85e605fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e1b147d046199545269b2a85e605fc");
        } else {
            this.d.setText(str);
        }
    }
}
