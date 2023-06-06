package com.meituan.android.legwork.ui.component.orderDetail;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetDialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.android.legwork.common.share.PtShareBean;
import com.meituan.android.legwork.common.share.PtShareBeanList;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ShareChannelDialogFragment extends BottomSheetDialogFragment implements DialogInterface.OnDismissListener {
    public static ChangeQuickRedirect a;
    public a b;
    private final String c;
    private TextView d;
    private LinearLayout e;
    private TextView f;
    private PtShareBean g;
    private PtShareBean h;
    private PtShareBeanList i;
    private boolean j;
    private Bitmap k;
    private k l;
    private String m;
    private PtBaseShare.OnShareListener n;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);

        void a(int i, int i2);

        void b(int i);
    }

    public ShareChannelDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8f5ca0cdd94678d98a01e950bbe31ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8f5ca0cdd94678d98a01e950bbe31ed");
            return;
        }
        this.c = getClass().getSimpleName();
        this.j = false;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.ui.component.orderDetail.a.a;
        this.n = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "77f5eb315f2d6ed8e737ad69199933cc", RobustBitConfig.DEFAULT_VALUE) ? (PtBaseShare.OnShareListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "77f5eb315f2d6ed8e737ad69199933cc") : new com.meituan.android.legwork.ui.component.orderDetail.a(this);
    }

    public static /* synthetic */ void a(ShareChannelDialogFragment shareChannelDialogFragment, int i, int i2) {
        Object[] objArr = {shareChannelDialogFragment, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d06e074327a4d272dc2560ae7ff85cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d06e074327a4d272dc2560ae7ff85cb0");
            return;
        }
        if (i2 == 1 && shareChannelDialogFragment.isAdded()) {
            shareChannelDialogFragment.j = true;
            shareChannelDialogFragment.dismiss();
        }
        x.b("ShareChannelDialogFragment.onShare()", String.format("分享结果:%d", Integer.valueOf(i2)));
        if (shareChannelDialogFragment.b != null) {
            shareChannelDialogFragment.b.a(i, i2);
        }
    }

    public static ShareChannelDialogFragment a(PtShareBean ptShareBean, PtShareBean ptShareBean2, String str) {
        Object[] objArr = {ptShareBean, ptShareBean2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eed8c4879bdd3eacb62fe90a0a488ff1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareChannelDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eed8c4879bdd3eacb62fe90a0a488ff1");
        }
        ShareChannelDialogFragment shareChannelDialogFragment = new ShareChannelDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_SHARE_BEAN_FRIEND", ptShareBean);
        bundle.putSerializable("KEY_SHARE_BEAN_CIRCLE", ptShareBean2);
        bundle.putString("share_channel", str);
        shareChannelDialogFragment.setArguments(bundle);
        return shareChannelDialogFragment;
    }

    public static ShareChannelDialogFragment a(PtShareBean ptShareBean, String str) {
        Object[] objArr = {ptShareBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "997c2db3d7522cee31a3d90c04d7438a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareChannelDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "997c2db3d7522cee31a3d90c04d7438a");
        }
        ShareChannelDialogFragment shareChannelDialogFragment = new ShareChannelDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_SHARE_BEAN_FRIEND", ptShareBean);
        bundle.putString("KEY_SHARE_ORDER_ID", str);
        bundle.putString("share_channel", "detailCouponShare");
        shareChannelDialogFragment.setArguments(bundle);
        return shareChannelDialogFragment;
    }

    public static ShareChannelDialogFragment a(PtShareBeanList ptShareBeanList, String str) {
        Object[] objArr = {ptShareBeanList, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83f8217b9074010c6b440b97b725cf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareChannelDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83f8217b9074010c6b440b97b725cf5");
        }
        ShareChannelDialogFragment shareChannelDialogFragment = new ShareChannelDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_SHARE_BEAN_LIST", ptShareBeanList);
        bundle.putSerializable("share_channel", str);
        shareChannelDialogFragment.setArguments(bundle);
        return shareChannelDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c56a86570664eb44db9150c93af361e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c56a86570664eb44db9150c93af361e");
        }
        View inflate = layoutInflater.inflate(R.layout.legwork_dialog_share, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.share_title);
        this.e = (LinearLayout) inflate.findViewById(R.id.share_channel_container);
        this.f = (TextView) inflate.findViewById(R.id.cancel);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        boolean z;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cfbd2dfff68eb92e1bb3a591653d8a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cfbd2dfff68eb92e1bb3a591653d8a1");
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            return;
        }
        this.m = getArguments().getString("share_channel");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5152ef719e387d008a11e6bf60417c7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5152ef719e387d008a11e6bf60417c7")).booleanValue();
        } else {
            Serializable a2 = f.a(getArguments(), "KEY_SHARE_BEAN_LIST");
            if (a2 instanceof PtShareBeanList) {
                this.i = (PtShareBeanList) a2;
                if (this.i.list != null && !this.i.list.isEmpty()) {
                    if (!TextUtils.isEmpty(this.i.title)) {
                        this.d.setText(this.i.title);
                        this.d.setVisibility(0);
                    }
                    boolean z2 = false;
                    for (PtShareBean ptShareBean : this.i.list) {
                        a(ptShareBean, z2);
                        z2 = true;
                    }
                    a();
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            return;
        }
        this.g = (PtShareBean) f.a(getArguments(), "KEY_SHARE_BEAN_CIRCLE");
        this.h = (PtShareBean) f.a(getArguments(), "KEY_SHARE_BEAN_FRIEND");
        String string = getArguments().getString("KEY_SHARE_ORDER_ID", "");
        if (this.h == null || (TextUtils.isEmpty(string) && this.g == null)) {
            dismiss();
            return;
        }
        if (this.g == null) {
            PtShareBean.a aVar = new PtShareBean.a(2);
            aVar.h = "paotui_c_orddtl_sw";
            this.g = aVar.a();
        }
        a();
        a(this.h, false);
        LinearLayout a3 = a(this.g, true);
        if (a3 == null) {
            return;
        }
        ((TextView) a3.findViewById(R.id.item)).setOnClickListener(b.a(this, string));
        HashMap hashMap = new HashMap();
        hashMap.put("status", "show");
        hashMap.put("share_channel", this.m);
        q.a("legwork_share_status", 128, hashMap);
        x.d("ShareChannelDialogFragment.onViewCreated()", "分享弹窗展示");
    }

    public static /* synthetic */ void a(ShareChannelDialogFragment shareChannelDialogFragment, String str, View view) {
        Object[] objArr = {shareChannelDialogFragment, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f94cce97a3d6fee3f58ede557bc6387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f94cce97a3d6fee3f58ede557bc6387");
            return;
        }
        x.a(shareChannelDialogFragment.c, String.format("是否需要下载朋友圈海报: %s", str));
        boolean z = (shareChannelDialogFragment.g == null || shareChannelDialogFragment.g.bmp == null || shareChannelDialogFragment.g.bmp.isRecycled()) ? false : true;
        if (TextUtils.isEmpty(str) || z) {
            x.a(shareChannelDialogFragment.c, "直接分享");
            com.meituan.android.legwork.common.share.e.a(shareChannelDialogFragment.getActivity(), shareChannelDialogFragment.m, shareChannelDialogFragment.g, shareChannelDialogFragment.n);
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, shareChannelDialogFragment, changeQuickRedirect2, false, "a55ff14a838677aee97f25fb65588890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, shareChannelDialogFragment, changeQuickRedirect2, false, "a55ff14a838677aee97f25fb65588890");
            return;
        }
        if (shareChannelDialogFragment.l != null && !shareChannelDialogFragment.l.isUnsubscribed()) {
            shareChannelDialogFragment.l.unsubscribe();
        }
        shareChannelDialogFragment.l = rx.d.a(new AnonymousClass1(), ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getLuckyPoster(str).b(rx.schedulers.a.e()).a(rx.schedulers.a.e()));
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d662638b7f456d428735470a05bef0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d662638b7f456d428735470a05bef0b");
            return;
        }
        super.onStart();
        Window window = getDialog() != null ? getDialog().getWindow() : null;
        if (window == null) {
            return;
        }
        try {
            window.findViewById(R.id.design_bottom_sheet).setBackgroundResource(R.drawable.legwork_common_bottom_dialog_fragment_bg);
        } catch (Resources.NotFoundException e) {
            x.e("ShareChannelDialogFragment.onStart()", "clear background resource failed,exception msg:", e);
            x.a(e);
        }
    }

    private LinearLayout a(PtShareBean ptShareBean, boolean z) {
        int i;
        int i2;
        Object[] objArr = {ptShareBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2dc85c626215cb1b2e316cb774a8f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2dc85c626215cb1b2e316cb774a8f8");
        }
        if (ptShareBean == null) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(), R.layout.legwork_dialog_share_item, null);
        Space space = (Space) linearLayout.findViewById(R.id.space);
        TextView textView = (TextView) linearLayout.findViewById(R.id.item);
        space.setVisibility(z ? 0 : 8);
        int i3 = ptShareBean.channel;
        switch (i3) {
            case 1:
                i = R.string.legwork_share_wx_friend;
                i2 = R.drawable.legwork_ic_wx_friend;
                break;
            case 2:
                i = R.string.legwork_share_wx_circle;
                i2 = R.drawable.legwork_ic_wx_circle;
                break;
            case 3:
                i = R.string.legwork_share_qq_friend;
                i2 = R.drawable.legwork_share_order_dialog_qq;
                break;
            case 4:
                i = R.string.legwork_share_sms;
                i2 = R.drawable.legwork_share_order_dialog_sms;
                break;
            default:
                return null;
        }
        textView.setText(i);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, 0);
        textView.setOnClickListener(c.a(this, i3, ptShareBean));
        this.e.addView(linearLayout);
        if (this.b != null) {
            this.b.a(i3);
        }
        return linearLayout;
    }

    public static /* synthetic */ void a(ShareChannelDialogFragment shareChannelDialogFragment, int i, PtShareBean ptShareBean, View view) {
        Object[] objArr = {shareChannelDialogFragment, Integer.valueOf(i), ptShareBean, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4aa20e16cc7848fc4bd5c6ec561fd6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4aa20e16cc7848fc4bd5c6ec561fd6c");
            return;
        }
        if (shareChannelDialogFragment.b != null) {
            shareChannelDialogFragment.b.b(i);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", "click");
        hashMap.put("share_channel", shareChannelDialogFragment.m);
        q.a("legwork_share_status", 128, hashMap);
        com.meituan.android.legwork.common.share.e.a(shareChannelDialogFragment.getActivity(), shareChannelDialogFragment.m, ptShareBean, shareChannelDialogFragment.n);
        x.d("ShareChannelDialogFragment.addShareItemView()", "用户点击【分享弹窗】弹窗中item，channel：" + i + "（1：CHANNEL_WEIXIN_FRIEND ；2：CHANNEL_WEIXIN_CIRCLE；3：CHANNEL_QQ_FRIEND； 4：CHANNEL_SMS）");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.component.orderDetail.ShareChannelDialogFragment$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends j<ap> {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            ap apVar = (ap) obj;
            Object[] objArr = {apVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3e4c6223fed84da6578a3fb33cf69b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3e4c6223fed84da6578a3fb33cf69b5");
            } else if (ShareChannelDialogFragment.this.getActivity() == null || ShareChannelDialogFragment.this.getActivity().isFinishing()) {
            } else {
                if (apVar != null && apVar.source() != null) {
                    try {
                        ShareChannelDialogFragment.this.k = com.sankuai.waimai.launcher.util.image.a.a(apVar.source());
                        if (ShareChannelDialogFragment.this.k != null) {
                            ShareChannelDialogFragment.this.e.post(e.a(this));
                            return;
                        } else {
                            ab.a((int) R.string.legwork_share_load_poster_failed);
                            return;
                        }
                    } catch (Exception e) {
                        ab.a((int) R.string.legwork_share_load_poster_failed);
                        x.e("ShareChannelDialogFragment.downloadCircleImage().onNext()", "图片解析失败,exception msg:", e);
                        x.a(e);
                        return;
                    }
                }
                ab.a((int) R.string.legwork_share_load_poster_failed);
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00546232e03d2e1cd7f69822d22084c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00546232e03d2e1cd7f69822d22084c3");
            } else {
                x.b(ShareChannelDialogFragment.this.c, "onCompleted");
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3505e5898daecd71592f2ab070bf87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3505e5898daecd71592f2ab070bf87");
                return;
            }
            ab.a((int) R.string.legwork_share_load_poster_failed);
            x.e("ShareChannelDialogFragment.downloadCircleImage().onError()", "exception msg:", th);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8baeafb87d7a5d74e3535c7e662532af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8baeafb87d7a5d74e3535c7e662532af");
            return;
        }
        if (this.b != null) {
            this.b.a(0);
        }
        this.f.setOnClickListener(d.a(this));
    }

    public static /* synthetic */ void a(ShareChannelDialogFragment shareChannelDialogFragment, View view) {
        Object[] objArr = {shareChannelDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af35f6c0b779f4faadd79bb4a8ff408e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af35f6c0b779f4faadd79bb4a8ff408e");
            return;
        }
        if (shareChannelDialogFragment.b != null) {
            shareChannelDialogFragment.b.b(0);
        }
        shareChannelDialogFragment.dismiss();
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6882b728cc3d9d4fbe85a4cf04738a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6882b728cc3d9d4fbe85a4cf04738a3");
            return;
        }
        try {
            super.dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4af9a0e9a803059003c4c1ea45590728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4af9a0e9a803059003c4c1ea45590728");
            return;
        }
        if (!this.j && this.b != null) {
            this.b.a(0, 3);
        }
        if (this.l != null && !this.l.isUnsubscribed()) {
            this.l.unsubscribe();
            this.l = null;
        }
        super.onDismiss(dialogInterface);
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2f993a15f48cebe3dea26a3afc7811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2f993a15f48cebe3dea26a3afc7811");
        } else {
            super.onCancel(dialogInterface);
        }
    }
}
