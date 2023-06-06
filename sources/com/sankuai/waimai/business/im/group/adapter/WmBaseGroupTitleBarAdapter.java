package com.sankuai.waimai.business.im.group.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.view.a;
import com.sankuai.waimai.business.im.group.View.WmGroupChatMemberPoiView;
import com.sankuai.waimai.business.im.group.View.WmGroupChatMemberRiderView;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.xm.im.vcard.d;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.theme.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmBaseGroupTitleBarAdapter implements View.OnClickListener, TitleBarAdapter {
    public static ChangeQuickRedirect a;
    protected ImageView b;
    protected ImageView c;
    protected TextView d;
    protected TextView e;
    private final View.OnClickListener f;
    private Activity g;
    private View h;
    private WmGroupChatMemberPoiView i;
    private WmGroupChatMemberRiderView j;
    private View k;
    private View l;
    private WmGroupShareData m;
    private a n;

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onThemeChanged(b bVar) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onTitleTextChanged(String str) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onUnreadCountChanged(int i) {
    }

    public WmBaseGroupTitleBarAdapter(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a244f7ecf4a76a6991a604c044baa14a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a244f7ecf4a76a6991a604c044baa14a");
        } else {
            this.f = onClickListener;
        }
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68154c3f166e2d2cbbc0557599419d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68154c3f166e2d2cbbc0557599419d2");
            return;
        }
        this.g = activity;
        this.m = WmGroupShareData.a(activity);
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de757e0786dff222b9fc77397e43dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de757e0786dff222b9fc77397e43dd1");
            return;
        }
        this.g = null;
        com.meituan.android.bus.a.a().b(this);
        this.n.a();
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8c46bf15995e30313a73deebd84d80", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8c46bf15995e30313a73deebd84d80");
        }
        if (context == null || viewGroup == null) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_im_group_titlebar_layout, viewGroup, true);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fca14e52c927a4bd473b4666de6f6b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fca14e52c927a4bd473b4666de6f6b68");
        } else {
            this.h = inflate.findViewById(R.id.wm_im_group_iv_chat_back);
            this.h.setOnClickListener(this);
            this.i = (WmGroupChatMemberPoiView) inflate.findViewById(R.id.wm_im_group_chat_poi_member_view);
            this.j = (WmGroupChatMemberRiderView) inflate.findViewById(R.id.wm_im_group_chat_rider_member_view);
            this.k = inflate.findViewById(R.id.ic_im_view1);
            this.l = inflate.findViewById(R.id.ic_im_view2);
            this.b = (ImageView) this.k.findViewById(R.id.im_title_icon_iv);
            this.d = (TextView) this.k.findViewById(R.id.im_title_text_tv);
            this.c = (ImageView) this.l.findViewById(R.id.im_title_icon_iv);
            this.e = (TextView) this.l.findViewById(R.id.im_title_text_tv);
            this.d.setText("电话");
            this.e.setText("店铺");
            ah.a(this.b, (int) R.drawable.wm_im_ic_phone_2);
            ah.a(this.c, (int) R.drawable.wm_im_ic_poi);
            this.l.setOnClickListener(this);
            this.k.setOnClickListener(this);
            this.n = new a(this.g, this.g.getString(R.string.wm_im_move_poi_rider_phone_to_here));
            this.n.a(this.d);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06b89927d275ca2646dddd1835ff3e02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06b89927d275ca2646dddd1835ff3e02");
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4deacb25982b206c7d218fcff90a3e79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4deacb25982b206c7d218fcff90a3e79");
                } else {
                    this.i.setMemberAvatar((this.m.e == null || this.m.e.a == null) ? "" : this.m.e.a.b);
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7da5209e7eff5f330958b91ab869fa1c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7da5209e7eff5f330958b91ab869fa1c");
                } else if (this.m.f != null && this.m.f.c != null && this.m.f.c.a != null && this.m.f.c.a.length != 0) {
                    this.j.a(true);
                    this.j.setMemberAvatar((this.m.e == null || this.m.e.b == null) ? "" : this.m.e.b.c);
                } else {
                    this.j.a(false);
                }
            }
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1839e53f3526085c301058a91cbe68", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1839e53f3526085c301058a91cbe68");
            return;
        }
        int id = view.getId();
        if (id == R.id.wm_im_group_iv_chat_back) {
            if (this.g != null) {
                this.g.finish();
            }
        } else if (id == R.id.ic_im_view2) {
            WmGroupShareData a2 = WmGroupShareData.a(this.g);
            Bundle bundle = new Bundle();
            bundle.putLong("poiId", a2.b);
            if (a2.e != null && a2.e.a != null) {
                bundle.putString("poiName", a2.e.a.a);
            }
            bundle.putString("from", "from poi im");
            com.sankuai.waimai.foundation.router.a.a(this.g, c.b, bundle);
        } else if (id != R.id.ic_im_view1 || this.f == null) {
        } else {
            this.f.onClick(view);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMemberChanged(com.sankuai.waimai.business.im.group.rxbus.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca67deaa7e848f984e756042e99b4e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca67deaa7e848f984e756042e99b4e5");
        } else if (cVar != null && cVar.a) {
            if (this.m.f == null || this.m.f.c == null || this.m.f.c.a == null || this.m.f.c.a.length == 0) {
                this.j.a(false);
            } else {
                com.sankuai.xm.ui.a.a().a(d.a(this.m.f.c.a[0], 1, (short) 1025), new com.sankuai.xm.im.d<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.waimai.business.im.group.adapter.WmBaseGroupTitleBarAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.d
                    public final /* synthetic */ void b_(com.sankuai.xm.im.vcard.entity.a aVar) {
                        com.sankuai.xm.im.vcard.entity.a aVar2 = aVar;
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27542d77483174f2d3fc8f7b53ee6cf8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27542d77483174f2d3fc8f7b53ee6cf8");
                        } else if (aVar2 != null) {
                            WmBaseGroupTitleBarAdapter.this.j.a(true);
                            WmBaseGroupTitleBarAdapter.this.j.setMemberAvatar(aVar2.b);
                        } else {
                            WmBaseGroupTitleBarAdapter.this.j.a(false);
                        }
                    }
                });
            }
        }
    }
}
