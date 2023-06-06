package com.sankuai.waimai.store.im.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.base.a;
import com.sankuai.waimai.store.im.base.i.ISGIMChatPageDelegateCreator;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMSessionFragment extends SGIMBaseSessionFragment {
    public static ChangeQuickRedirect f;

    @Override // com.sankuai.waimai.store.im.base.SGIMBaseSessionFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e5014217099c0a17153d0aeb8cc17a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e5014217099c0a17153d0aeb8cc17a");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void a(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1bbe0019109caecf31cfb7e225a6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1bbe0019109caecf31cfb7e225a6eb");
            return;
        }
        if (this.c != null) {
            this.c.a(list);
        }
        super.a(list);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ca480308a70439663a285209e1fd384", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ca480308a70439663a285209e1fd384");
        }
        if (this.c != null) {
            return this.c.f();
        }
        return super.a();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77f94d969d3e9ad869acefa972f8854", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77f94d969d3e9ad869acefa972f8854");
        }
        if (this.c != null) {
            return this.c.g();
        }
        return super.b();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e85a6cf148cf39f3122ac5a1e8ad7cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e85a6cf148cf39f3122ac5a1e8ad7cc");
        }
        if (this.c != null) {
            return this.c.j();
        }
        return super.d();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "804be18a33134ce7871bd54de2fa3887", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "804be18a33134ce7871bd54de2fa3887");
        }
        if (this.c != null) {
            return this.c.l();
        }
        return super.bo_();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd510f1798c5f74598f69e3ddf262ae7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd510f1798c5f74598f69e3ddf262ae7")).booleanValue();
        }
        if (this.c != null) {
            return this.c.a(bVar);
        }
        return super.a(bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81aca1c6d9fef4c86ec61f5d5f53aeb7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81aca1c6d9fef4c86ec61f5d5f53aeb7")).booleanValue();
        }
        if (this.c != null) {
            return this.c.a(i, bVar);
        }
        return super.a(i, bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f3e04df1c1f537577aa76d33156db04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f3e04df1c1f537577aa76d33156db04");
        } else {
            super.a(z);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a2e964c0d515930169d2a03f870164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a2e964c0d515930169d2a03f870164");
            return;
        }
        if (i2 == 4 && i != 0) {
            Object[] objArr2 = {"onQueryMsgResult"};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.base.log.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51945d63ddd8a2817b2f87f33d2f86e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51945d63ddd8a2817b2f87f33d2f86e8");
            } else {
                com.sankuai.waimai.store.im.base.log.b.a("sg_im_im_session", "历史消息加载失败", "操作为onQueryMsgResult");
            }
        }
        if (this.c != null) {
            this.c.a(i, str, list, i2, z);
        }
        super.a(i, str, list, i2, z);
    }

    @Override // com.sankuai.waimai.store.im.base.SGIMBaseSessionFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d29cdd4d0eddfd9a38140256670513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d29cdd4d0eddfd9a38140256670513");
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.SGIMBaseSessionFragment, android.support.v4.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932e9e8e3efb077e4943a143ebb74724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932e9e8e3efb077e4943a143ebb74724");
            return;
        }
        super.onViewStateRestored(bundle);
        SessionParams sessionParams = this.t;
        if (sessionParams != null) {
            String string = sessionParams.u.getString("delegate_type");
            if (this.c == null) {
                a(string, sessionParams.u);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19befeceb20bc9dc03a1dd4cbb365ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19befeceb20bc9dc03a1dd4cbb365ce3");
        } else {
            super.a(z, str);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.SGIMBaseSessionFragment
    public final void a(String str, Bundle bundle) {
        com.sankuai.waimai.store.im.base.i.a newInstance;
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ddd8bf8316fb0284f176794ab86cd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ddd8bf8316fb0284f176794ab86cd3");
            return;
        }
        a aVar = a.C1206a.a;
        Object[] objArr2 = {str, this, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5c48faca8f4e10030d42a62ccbc58221", RobustBitConfig.DEFAULT_VALUE)) {
            newInstance = (com.sankuai.waimai.store.im.base.i.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5c48faca8f4e10030d42a62ccbc58221");
        } else {
            ISGIMChatPageDelegateCreator iSGIMChatPageDelegateCreator = (ISGIMChatPageDelegateCreator) com.sankuai.waimai.router.a.a(ISGIMChatPageDelegateCreator.class, str);
            newInstance = iSGIMChatPageDelegateCreator == null ? null : iSGIMChatPageDelegateCreator.newInstance(this, bundle);
        }
        if (newInstance != null) {
            this.c = newInstance;
            return;
        }
        Object[] objArr3 = {str, bundle == null ? "" : bundle.toString()};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.base.log.b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9e8aef3409fe91b1df08138589724726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9e8aef3409fe91b1df08138589724726");
            return;
        }
        com.sankuai.waimai.store.im.base.log.b.a("sg_im_im_session", "im会话代理类为null", "业务类型为：" + str);
    }
}
