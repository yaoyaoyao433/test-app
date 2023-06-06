package com.sankuai.waimai.store.poi.list.newp.block;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.im.number.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class UnreadMessageBlock extends b implements e {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public Drawable c;
    private SCBaseActivity d;
    private TextView e;
    private long f;
    private com.sankuai.waimai.store.im.number.b g;

    public static /* synthetic */ void a(UnreadMessageBlock unreadMessageBlock, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, unreadMessageBlock, changeQuickRedirect, false, "060605fbdf25fbb2125e8962467b7781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, unreadMessageBlock, changeQuickRedirect, false, "060605fbdf25fbb2125e8962467b7781");
        } else if (unreadMessageBlock.e != null) {
            if (i > 99) {
                i = 99;
            }
            if (i > 0) {
                u.a(unreadMessageBlock.e, String.valueOf(i));
            } else {
                u.c(unreadMessageBlock.e);
            }
        }
    }

    public UnreadMessageBlock(@NonNull SCBaseActivity sCBaseActivity, long j) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0facd3251f8bdaee64dba6c58928c50f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0facd3251f8bdaee64dba6c58928c50f");
            return;
        }
        this.g = new com.sankuai.waimai.store.im.number.b() { // from class: com.sankuai.waimai.store.poi.list.newp.block.UnreadMessageBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.number.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33e4ce20d5edfaaabfa49e3d6ed9c4b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33e4ce20d5edfaaabfa49e3d6ed9c4b4");
                } else {
                    UnreadMessageBlock.a(UnreadMessageBlock.this, i);
                }
            }
        };
        this.d = sCBaseActivity;
        this.f = j;
        this.d.getLifecycle().a(this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f4f4c6ac62f330387e8a5b8c551786", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f4f4c6ac62f330387e8a5b8c551786") : layoutInflater.inflate(R.layout.wm_sg_include_home_unread_message, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9a6d66b350bc0486b25ab8f09d3678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9a6d66b350bc0486b25ab8f09d3678");
            return;
        }
        super.onViewCreated();
        setVisible(false);
        this.b = (ImageView) findView(R.id.iv_check_message);
        this.e = (TextView) findView(R.id.txt_unread_message_num);
        u.c(this.e);
        this.c = ContextCompat.getDrawable(this.mContext, R.drawable.wm_sc_home_message_center);
        d.a().a(this.g);
    }

    @Override // com.sankuai.waimai.store.base.b
    @OnLifecycleEvent(d.a.ON_RESUME)
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe3b911b7a225f56cc3615eb7ae82cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe3b911b7a225f56cc3615eb7ae82cc");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    @OnLifecycleEvent(d.a.ON_DESTROY)
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76fb32163410095de93063c6d0f68e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76fb32163410095de93063c6d0f68e5");
            return;
        }
        if (this.d != null) {
            this.d.getLifecycle().b(this);
        }
        com.sankuai.waimai.store.im.number.d.a().b(this.g);
        super.onDestroy();
    }
}
