package com.meituan.msc.modules.api.msi.env;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.meituan.msi.api.component.input.MSIBaseInputEvent;
import com.meituan.msi.page.ComponentParam;
import com.meituan.msi.page.IPage;
import com.meituan.msi.page.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements IPage {
    public static ChangeQuickRedirect a;
    public com.meituan.msc.modules.page.e b;
    public int c;
    private com.meituan.msi.page.c d;

    public e(@NonNull com.meituan.msc.modules.page.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be1c62a1cce0a95b7783ed9cd22a943", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be1c62a1cce0a95b7783ed9cd22a943");
            return;
        }
        this.d = new AnonymousClass1();
        this.b = eVar;
    }

    @Override // com.meituan.msi.page.IPage
    public final com.meituan.msi.page.e getViewGroup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a46302554dd422d7f2b6d06c9c75779", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a46302554dd422d7f2b6d06c9c75779");
        }
        if (this.b != null) {
            return this.b.Q_();
        }
        return null;
    }

    @Override // com.meituan.msi.page.IPage
    public final String getPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d143e1d6a2fda4ccafa81794daf23d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d143e1d6a2fda4ccafa81794daf23d");
        }
        if (this.b != null) {
            return this.b.f();
        }
        return null;
    }

    @Override // com.meituan.msi.page.IPage
    public final com.meituan.msi.page.c getKeyBoard() {
        return this.d;
    }

    @Override // com.meituan.msi.page.IPage
    public final void showView(int i, View view, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c1bf8d03b4be856bba4f2654ca7677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c1bf8d03b4be856bba4f2654ca7677");
        } else if (i != 1 || this.b == null) {
        } else {
            this.b.a(view, aVar);
        }
    }

    @Override // com.meituan.msi.page.IPage
    public final View findView(int i, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bd2cbd7d8632e1860b226ca8f120b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bd2cbd7d8632e1860b226ca8f120b6");
        }
        if (this.b == null || i != 1) {
            return null;
        }
        return this.b.P_();
    }

    @Override // com.meituan.msi.page.IPage
    public final void hideView(int i, View view, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872d8a5925978b581b3c34ffdaf8f0e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872d8a5925978b581b3c34ffdaf8f0e8");
        } else if (i != 1 || this.b == null) {
        } else {
            this.b.y();
        }
    }

    @Override // com.meituan.msi.page.IPage
    public final View getAndCreateView(int i, String str, f fVar) {
        com.meituan.msc.modules.page.b Q_;
        Object[] objArr = {Integer.valueOf(i), str, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe6ed0bfbf729e9bd6b238ab0556932", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe6ed0bfbf729e9bd6b238ab0556932");
        }
        if (this.b == null || i != 2 || (Q_ = this.b.Q_()) == null) {
            return null;
        }
        return Q_.a(str, fVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.api.msi.env.e$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements com.meituan.msi.page.c {
        public static ChangeQuickRedirect a;
        private Handler e = new Handler(Looper.getMainLooper());
        public boolean b = false;
        public Runnable c = new Runnable() { // from class: com.meituan.msc.modules.api.msi.env.e.1.1
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass1.this.b = true;
            }
        };

        public AnonymousClass1() {
        }

        @Override // com.meituan.msi.page.c
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22535f98a6c07210d532c061181d0e43", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22535f98a6c07210d532c061181d0e43")).intValue();
            }
            if (e.this.b != null) {
                return e.this.b.R_();
            }
            return 0;
        }

        @Override // com.meituan.msi.page.c
        public final void a(com.meituan.msi.page.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673f190af8107240603b6652b9df3aa2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673f190af8107240603b6652b9df3aa2");
            } else if (e.this.b != null) {
                e.this.b.a(dVar);
            }
        }

        @Override // com.meituan.msi.page.c
        public final void a(int i, int i2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162394153b4ce947cfaee8323a15124b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162394153b4ce947cfaee8323a15124b");
            } else if (e.this.b != null) {
                e.this.b.a(i, i2, z);
            }
        }

        @Override // com.meituan.msi.page.c
        public final void a(@Size(2) int[] iArr) {
            Object[] objArr = {iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f867618c4d70cd992dcda5149923f1f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f867618c4d70cd992dcda5149923f1f5");
            } else if (e.this.b != null) {
                e.this.b.a(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
        }

        @Override // com.meituan.msi.page.c
        public final int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a6f78a98e907293c591c04fadf9b76", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a6f78a98e907293c591c04fadf9b76")).intValue();
            }
            if (e.this.b != null) {
                return e.this.b.r();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x02e7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0287  */
        @Override // com.meituan.msi.page.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(com.meituan.msi.page.a r22, android.view.View r23, com.meituan.msi.page.b r24, com.meituan.msi.dispather.e r25, com.meituan.msi.page.ComponentParam r26) {
            /*
                Method dump skipped, instructions count: 756
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.api.msi.env.e.AnonymousClass1.a(com.meituan.msi.page.a, android.view.View, com.meituan.msi.page.b, com.meituan.msi.dispather.e, com.meituan.msi.page.ComponentParam):boolean");
        }

        private boolean a(View view, com.meituan.msi.page.b bVar, com.meituan.msi.dispather.e eVar, ComponentParam componentParam) {
            Object[] objArr = {view, bVar, eVar, componentParam};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5885ce13f46e2a4c4ee0bede6baebe", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5885ce13f46e2a4c4ee0bede6baebe")).booleanValue();
            }
            if (componentParam.oldh != 0 && bVar != null) {
                if ((view instanceof TextView) && ((TextView) view).isCursorVisible()) {
                    if (TextUtils.isEmpty(componentParam.viewId)) {
                        return false;
                    }
                    if (bVar instanceof com.meituan.msi.api.component.textaera.a) {
                        try {
                            Integer num = ((com.meituan.msi.api.component.textaera.a) bVar).c.get(componentParam.viewId);
                            Integer num2 = ((com.meituan.msi.api.component.textaera.a) bVar).d.get(componentParam.viewId);
                            Integer valueOf = Integer.valueOf(num2 == null ? 0 : num2.intValue());
                            ((com.meituan.msi.api.component.textaera.a) bVar).c.put(componentParam.viewId, Integer.valueOf((Integer.valueOf(num == null ? 0 : num.intValue()).intValue() + componentParam.h) - componentParam.oldh));
                            bVar.a(valueOf.intValue(), componentParam.h - componentParam.oldh);
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                } else if (TextUtils.isEmpty(componentParam.viewId)) {
                    return false;
                } else {
                    try {
                        Integer num3 = ((com.meituan.msi.api.component.textaera.a) bVar).c.get(componentParam.viewId);
                        Integer valueOf2 = Integer.valueOf(num3 == null ? 0 : num3.intValue());
                        Integer num4 = ((com.meituan.msi.api.component.textaera.a) bVar).d.get(componentParam.viewId);
                        Integer valueOf3 = Integer.valueOf(num4 == null ? 0 : num4.intValue());
                        int intValue = (valueOf2.intValue() + componentParam.h) - componentParam.oldh;
                        int intValue2 = (valueOf3.intValue() + componentParam.h) - componentParam.oldh;
                        ((com.meituan.msi.api.component.textaera.a) bVar).c.put(componentParam.viewId, Integer.valueOf(intValue));
                        ((com.meituan.msi.api.component.textaera.a) bVar).d.put(componentParam.viewId, Integer.valueOf(intValue2));
                    } catch (Exception unused2) {
                        return false;
                    }
                }
            }
            if (componentParam.autoHeight) {
                int i = componentParam.h - componentParam.oldh;
                try {
                    MSIBaseInputEvent mSIBaseInputEvent = new MSIBaseInputEvent();
                    mSIBaseInputEvent.lineCount = componentParam.lineCount;
                    mSIBaseInputEvent.height = Math.round(com.meituan.msi.util.f.c(componentParam.h));
                    mSIBaseInputEvent.viewId = componentParam.viewId;
                    if (eVar != null) {
                        eVar.a("onTextAreaHeightChange", mSIBaseInputEvent);
                    }
                    if (componentParam.keyboardHeight != 0 && componentParam.isKeyboardShow) {
                        com.meituan.msi.api.component.textaera.a aVar = (com.meituan.msi.api.component.textaera.a) bVar;
                        String str = componentParam.viewId;
                        int i2 = componentParam.keyboardHeight;
                        Object[] objArr2 = {view, aVar, Integer.valueOf(i), str, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faf8b974ac6cd5dd13933f2185304a9f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faf8b974ac6cd5dd13933f2185304a9f");
                            return false;
                        }
                        int intValue3 = aVar.d.get(str).intValue();
                        if (intValue3 > view.getHeight()) {
                            if (i < 0) {
                                Rect rect = new Rect();
                                view.getGlobalVisibleRect(rect);
                                if (rect.top + i < intValue3) {
                                    return false;
                                }
                            }
                            int r = e.this.b.r();
                            Rect rect2 = new Rect();
                            view.getGlobalVisibleRect(rect2);
                            if (rect2.bottom + i2 + com.meituan.msi.util.f.a(42) > com.meituan.msi.util.f.b() && r == e.this.c) {
                                e.this.b.a(i);
                                return false;
                            } else if (r > e.this.c) {
                                e.this.c = r;
                                return false;
                            } else {
                                return false;
                            }
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7e39272183ee954c7e772f3cc261e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7e39272183ee954c7e772f3cc261e0")).booleanValue();
        }
        try {
            return view.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }
}
