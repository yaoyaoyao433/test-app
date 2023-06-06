package com.sankuai.waimai.store.manager.marketing.parser.inner.mach;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGMarketingDialog;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGMachDialogTemplateParser extends com.sankuai.waimai.store.manager.marketing.parser.b<Dialog> {
    public static ChangeQuickRedirect a;
    String b;

    @Override // com.sankuai.waimai.store.manager.marketing.parser.a
    public final /* synthetic */ Object a(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.platform.marketing.a aVar, com.sankuai.waimai.store.manager.sequence.a aVar2) {
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f917e4926d35aa7b63280908144a5345", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f917e4926d35aa7b63280908144a5345");
        }
        if (t.a(aVar.b) || t.a(aVar.c)) {
            return null;
        }
        this.b = String.valueOf(hashCode());
        if (aVar2 != null) {
            aVar2.a(aVar.b, this.b);
        }
        return new SGMachDialog(activity, new FrameLayout(activity), aVar, aVar2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class SGMachDialog extends SCBaseDialog implements com.sankuai.waimai.store.expose.v2.a, e {
        public static ChangeQuickRedirect a;
        private d c;
        private Activity d;
        private Handler e;
        private ViewGroup f;
        private com.sankuai.waimai.store.manager.sequence.a g;

        public SGMachDialog(@NonNull Activity activity, @NonNull ViewGroup viewGroup, @NonNull final com.sankuai.waimai.store.platform.marketing.a aVar, com.sankuai.waimai.store.manager.sequence.a aVar2) {
            super(activity, R.style.WmStBaseDialogTheme);
            FrameLayout frameLayout;
            Object[] objArr = {SGMachDialogTemplateParser.this, activity, viewGroup, aVar, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52be09ad95a13852888ed1503dd56d42", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52be09ad95a13852888ed1503dd56d42");
                return;
            }
            this.e = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.SGMachDialogTemplateParser.SGMachDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "796af8ab0155ecc2deeeb7c06edb451a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "796af8ab0155ecc2deeeb7c06edb451a");
                    } else if (message.what != 100 || SGMachDialog.this.f == null) {
                    } else {
                        SGMachDialog.this.f.setVisibility(0);
                        SGMachDialog.this.c.d();
                    }
                }
            };
            this.d = activity;
            this.f = viewGroup;
            this.g = aVar2;
            Object[] objArr2 = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e653876cb211c188aee5f15a720db34", RobustBitConfig.DEFAULT_VALUE)) {
                frameLayout = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e653876cb211c188aee5f15a720db34");
            } else {
                FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.SGMachDialogTemplateParser.SGMachDialog.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38c13a283cbb372dc86de21d12067053", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "38c13a283cbb372dc86de21d12067053");
                        } else if (SGMachDialog.this.l) {
                            SGMachDialog.this.dismiss();
                        }
                    }
                });
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                if (layoutParams != null) {
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                }
                viewGroup.setClickable(true);
                frameLayout2.addView(viewGroup, layoutParams2);
                frameLayout = frameLayout2;
            }
            setContentView(frameLayout);
            if (getWindow() != null) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.width = -1;
                attributes.height = -2;
                getWindow().setAttributes(attributes);
            }
            this.c = new d(this, SGMachDialogTemplateParser.this.f == null ? "" : SGMachDialogTemplateParser.this.f.d(), viewGroup, this, aVar) { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.SGMachDialogTemplateParser.SGMachDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "478463ece28200fe20c6a075fe12218d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "478463ece28200fe20c6a075fe12218d");
                        return;
                    }
                    SGMachDialog.this.f.setVisibility(4);
                    try {
                        SGMachDialog.super.show();
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }

                @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d
                public final void a(Exception exc) {
                    Object[] objArr3 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64803f2cb63d48e4fe8c8e8e80b13320", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64803f2cb63d48e4fe8c8e8e80b13320");
                    } else if (SGMachDialog.this.g != null) {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(LogMonitor.EXCEPTION_TAG, Log.getStackTraceString(exc));
                            hashMap.put("templateID", aVar.b);
                            hashMap.put("templateData", aVar.c);
                            SGMachDialog.this.g.a(aVar.b, SGMarketingDialog.MachRenderError, i.a(hashMap));
                        } catch (Throwable th) {
                            com.sankuai.waimai.store.base.log.a.a(th);
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.d
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d371225a04baa07852b04ea18033ed5e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d371225a04baa07852b04ea18033ed5e");
                        return;
                    }
                    if (SGMachDialog.this.e.hasMessages(100)) {
                        SGMachDialog.this.e.removeMessages(100);
                    }
                    SGMachDialog.this.e.sendEmptyMessageDelayed(100, 300L);
                    if (SGMachDialog.this.g != null) {
                        SGMachDialog.this.g.b(SGMachDialog.this.c.c(), SGMachDialogTemplateParser.this.b);
                    }
                }
            };
            if ("supermarket-persuade-coupon".equals(this.c.c())) {
                setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.SGMachDialogTemplateParser.SGMachDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i), keyEvent};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e8ad2b9f80cf82b5e6eda698c708834c", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e8ad2b9f80cf82b5e6eda698c708834c")).booleanValue();
                        }
                        if (i == 4 && keyEvent.getAction() == 1) {
                            SGMachDialog.this.f.setVisibility(8);
                            SGMachDialog.this.c.f.b("back", (Map<String, Object>) null);
                        }
                        return true;
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1fcdb13c575a99309b2100846ca541", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1fcdb13c575a99309b2100846ca541");
            } else {
                dismiss();
            }
        }

        @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe7da4c9eae6f45f187b71007d6fbbd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe7da4c9eae6f45f187b71007d6fbbd");
            } else {
                this.f.setVisibility(8);
            }
        }

        @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
        public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
            Object[] objArr = {aVar, str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93ce394ceb13e3f4aa78fe64770f38a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93ce394ceb13e3f4aa78fe64770f38a");
            } else if (SGMachDialogTemplateParser.this.f != null) {
                Map<String, Object> hashMap = map != null ? map : new HashMap<>();
                hashMap.put("key_parser_type", 1);
                com.sankuai.waimai.store.manager.marketing.d dVar = SGMachDialogTemplateParser.this.f;
                if (map == null) {
                    map = hashMap;
                }
                dVar.a(aVar, str, map);
            }
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Object[] objArr = {dialogInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c2491a166629a1566d08a157a318e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c2491a166629a1566d08a157a318e7");
                return;
            }
            super.onDismiss(dialogInterface);
            this.c.f.b("dismiss", (Map<String, Object>) null);
            if (this.e.hasMessages(100)) {
                this.e.removeMessages(100);
            }
            com.sankuai.waimai.store.expose.v2.b.a().e(this);
            com.sankuai.waimai.store.expose.v2.b.a().b(this);
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Object[] objArr = {dialogInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba299052c5afebf466e80eda4ec29f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba299052c5afebf466e80eda4ec29f6");
                return;
            }
            super.onShow(dialogInterface);
            com.sankuai.waimai.store.expose.v2.b.a().a(this);
            com.sankuai.waimai.store.expose.v2.b.a().c(this);
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
        public void show() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3068f32c4cf93d1ff66732281a29ea83", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3068f32c4cf93d1ff66732281a29ea83");
            } else {
                this.c.e();
            }
        }

        @Override // com.sankuai.waimai.store.expose.v2.a
        public final View f() {
            return this.f;
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, com.sankuai.waimai.store.expose.v2.a
        public final Activity bB_() {
            return this.d;
        }
    }
}
