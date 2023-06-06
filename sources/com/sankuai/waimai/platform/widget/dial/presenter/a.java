package com.sankuai.waimai.platform.widget.dial.presenter;

import android.app.Dialog;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.widget.dial.domain.model.PrivacyInfo;
import com.sankuai.waimai.platform.widget.dial.domain.repository.b;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements DialContract.Presenter {
    public static ChangeQuickRedirect a;
    DialContract.c b;
    public DialContract.b c;
    private b d;

    public static /* synthetic */ void a(a aVar, String str, ArrayList arrayList, String str2, final int i, boolean z) {
        Object[] objArr = {str, arrayList, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e2e953134aa1a197954fcf89d80528e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e2e953134aa1a197954fcf89d80528e4");
            return;
        }
        final String a2 = aVar.a(arrayList);
        if (aVar.d != null) {
            aVar.a(true);
            aVar.d.a(str, arrayList, str2, i, z, new b.a<PrivacyInfo>() { // from class: com.sankuai.waimai.platform.widget.dial.presenter.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b.a
                public final /* synthetic */ void a(PrivacyInfo privacyInfo) {
                    PrivacyInfo privacyInfo2 = privacyInfo;
                    Object[] objArr2 = {privacyInfo2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9e46256bfddd712e90fd61693679409", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9e46256bfddd712e90fd61693679409");
                        return;
                    }
                    a.this.a(false);
                    if (privacyInfo2 != null) {
                        switch (privacyInfo2.code) {
                            case 0:
                                a aVar2 = a.this;
                                String str3 = a2;
                                int i2 = i;
                                Object[] objArr3 = {privacyInfo2, str3, Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "ee974567b5b1cdee73ba3eb45482f94c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "ee974567b5b1cdee73ba3eb45482f94c");
                                    return;
                                } else if (privacyInfo2 != null && privacyInfo2.data != null) {
                                    switch (privacyInfo2.data.c) {
                                        case 1:
                                            aVar2.a(privacyInfo2.data.b);
                                            return;
                                        case 2:
                                            aVar2.a(privacyInfo2.data.d, privacyInfo2.data.e, privacyInfo2.data.b, privacyInfo2.data.f != null && privacyInfo2.data.f.a == 1, i2);
                                            return;
                                        case 3:
                                            String str4 = privacyInfo2.data.d;
                                            if (str4 == null || str4.length() == 0) {
                                                str4 = ab.a(R.string.takeout_widget_filter_bar_toast_default_action_show_main_desc);
                                            }
                                            aVar2.b(str4);
                                            return;
                                        default:
                                            aVar2.b(privacyInfo2.data.d, privacyInfo2.data.e, privacyInfo2.data.b, i2);
                                            return;
                                    }
                                } else {
                                    aVar2.a(str3, i2);
                                    return;
                                }
                            case 1:
                                a.this.a(a2, i);
                                return;
                            default:
                                a.this.a(a2, i);
                                return;
                        }
                    }
                    a.this.a(a2, i);
                }

                @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "042db6d8b32e362be94178de6b822251", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "042db6d8b32e362be94178de6b822251");
                        return;
                    }
                    a.this.a(false);
                    a.this.b("电话服务暂不可用，请稍后再试吧~");
                }
            });
        }
    }

    public a(DialContract.c cVar, b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a800cfb0d426204cccf95f3fd95d26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a800cfb0d426204cccf95f3fd95d26");
            return;
        }
        this.b = cVar;
        this.d = bVar;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd68f98372b0340af54263e8aef51d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd68f98372b0340af54263e8aef51d8");
        } else if (this.b != null) {
            this.b.a(str);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.Presenter
    public final void a(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1676308c67434884094c806a2607f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1676308c67434884094c806a2607f12");
        } else {
            a(str, str2, str3, 0, (DialContract.a) null);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.Presenter
    public final void a(String str, String str2, String str3, int i, DialContract.a aVar) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a32905c6cddffee2a08e164457a0fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a32905c6cddffee2a08e164457a0fce");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        a(str, arrayList, str3, i, aVar);
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.Presenter
    public final void a(String str, ArrayList<String> arrayList, String str2, int i) {
        Object[] objArr = {str, arrayList, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537727f1b8b86525a8624d769cca1177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537727f1b8b86525a8624d769cca1177");
        } else {
            a(str, arrayList, str2, i, (DialContract.a) null);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.Presenter
    public final void a(final String str, final ArrayList<String> arrayList, final String str2, final int i, final DialContract.a aVar) {
        Object[] objArr = {str, arrayList, str2, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b1e86375b82f884bda067f29940500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b1e86375b82f884bda067f29940500");
            return;
        }
        final String a2 = a(arrayList);
        if (this.d != null) {
            a(true);
            this.d.a(str, arrayList, str2, i, new b.a<PrivacyInfo>() { // from class: com.sankuai.waimai.platform.widget.dial.presenter.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b.a
                public final /* synthetic */ void a(PrivacyInfo privacyInfo) {
                    final PrivacyInfo.PrivacyData.a aVar2;
                    PrivacyInfo privacyInfo2 = privacyInfo;
                    Object[] objArr2 = {privacyInfo2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41ac64c45931e1d426cd5d94f1525597", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41ac64c45931e1d426cd5d94f1525597");
                        return;
                    }
                    a.this.a(false);
                    if (aVar != null && privacyInfo2 != null && privacyInfo2.data != null && privacyInfo2.data.c == 4 && !TextUtils.isEmpty(privacyInfo2.data.b)) {
                        aVar.a(privacyInfo2.data.b);
                    } else if (privacyInfo2 != null) {
                        switch (privacyInfo2.code) {
                            case 0:
                                final a aVar3 = a.this;
                                String str3 = str;
                                ArrayList<String> arrayList2 = arrayList;
                                String str4 = str2;
                                final int i2 = i;
                                Object[] objArr3 = {str3, arrayList2, str4, Integer.valueOf(i2), privacyInfo2};
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "928fdbac9e3a677e218c917d4336cf21", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "928fdbac9e3a677e218c917d4336cf21");
                                    return;
                                } else if (privacyInfo2 != null && privacyInfo2.data != null) {
                                    switch (privacyInfo2.data.c) {
                                        case 1:
                                            aVar3.a(privacyInfo2.data.d, privacyInfo2.data.e, str3, arrayList2, privacyInfo2.data.b, i2, privacyInfo2.data.g);
                                            return;
                                        case 2:
                                            final PrivacyInfo.PrivacyData privacyData = privacyInfo2.data;
                                            Object[] objArr4 = {privacyData, Integer.valueOf(i2)};
                                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                            if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "96cfcd8aed2e2aaa8cf2ab7f22fcc797", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "96cfcd8aed2e2aaa8cf2ab7f22fcc797");
                                                return;
                                            }
                                            if (aVar3.c != null) {
                                                aVar3.c.a(true);
                                            }
                                            String str5 = privacyData.d;
                                            str5 = (str5 == null || str5.length() == 0) ? "号码保护已失效" : "号码保护已失效";
                                            String str6 = privacyData.e;
                                            str6 = (str6 == null || str6.length() == 0) ? "订单超过48小时，已无法为您加密呼出。建议您联系客服处理。" : "订单超过48小时，已无法为您加密呼出。建议您联系客服处理。";
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = PrivacyInfo.PrivacyData.a;
                                            if (PatchProxy.isSupport(objArr5, privacyData, changeQuickRedirect5, false, "343bcdf576fcef6a1c62f992ae023d8b", RobustBitConfig.DEFAULT_VALUE)) {
                                                aVar2 = (PrivacyInfo.PrivacyData.a) PatchProxy.accessDispatch(objArr5, privacyData, changeQuickRedirect5, false, "343bcdf576fcef6a1c62f992ae023d8b");
                                            } else {
                                                aVar2 = (privacyData.h == null || privacyData.h.size() == 0) ? null : privacyData.h.get(0);
                                            }
                                            if (aVar3.b != null) {
                                                aVar3.b.a(str5, str6, privacyData.g, aVar2 == null ? null : aVar2.a, new DialContract.c.d() { // from class: com.sankuai.waimai.platform.widget.dial.presenter.a.5
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.d
                                                    public final void a() {
                                                        Object[] objArr6 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3f5bf1c972a70e7fa16d6be217e6aa16", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3f5bf1c972a70e7fa16d6be217e6aa16");
                                                        } else if (aVar2 != null) {
                                                            a.this.a(aVar2.b);
                                                        }
                                                    }

                                                    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.b
                                                    public final boolean b() {
                                                        Object[] objArr6 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2241d1ca9b0052611af633b93375cc5c", RobustBitConfig.DEFAULT_VALUE)) {
                                                            return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2241d1ca9b0052611af633b93375cc5c")).booleanValue();
                                                        }
                                                        if (a.this.c != null) {
                                                            a.this.c.a(true, true, i2);
                                                        }
                                                        a.this.a(privacyData.b);
                                                        return true;
                                                    }

                                                    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.b
                                                    public final boolean c() {
                                                        Object[] objArr6 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "da39ed44720684b15441c5175e5dc6ba", RobustBitConfig.DEFAULT_VALUE)) {
                                                            return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "da39ed44720684b15441c5175e5dc6ba")).booleanValue();
                                                        }
                                                        if (a.this.c != null) {
                                                            a.this.c.a(true, false, i2);
                                                        }
                                                        return true;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        case 3:
                                            String str7 = privacyInfo2.data.d;
                                            if (str7 == null || str7.length() == 0) {
                                                str7 = ab.a(R.string.takeout_widget_filter_bar_toast_default_action_show_main_desc);
                                            }
                                            aVar3.b(str7);
                                            return;
                                        default:
                                            aVar3.b(privacyInfo2.data.d, privacyInfo2.data.e, privacyInfo2.data.b, i2);
                                            return;
                                    }
                                } else {
                                    aVar3.a(aVar3.a(arrayList2), i2);
                                    return;
                                }
                            case 1:
                                a.this.a(a2, i);
                                return;
                            default:
                                a.this.a(a2, i);
                                return;
                        }
                    } else {
                        a.this.a(a2, i);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13eea89a803054c61041a2f7e2f1e3b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13eea89a803054c61041a2f7e2f1e3b1");
                        return;
                    }
                    a.this.a(false);
                    a.this.b("电话服务暂不可用，请稍后再试吧~");
                }
            });
        }
    }

    void a(final String str, final String str2, final String str3, final ArrayList<String> arrayList, final String str4, final int i, final String str5) {
        Object[] objArr = {str, str2, str3, arrayList, str4, Integer.valueOf(i), str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd8251b712f89b5d3cea1c081576be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd8251b712f89b5d3cea1c081576be1");
            return;
        }
        if (this.c != null) {
            this.c.a();
        }
        a(str, str2, str4, ab.a(R.string.takeout_widget_filter_bar_dialog_default_positive_text), ab.a(R.string.takeout_widget_filter_bar_dialog_default_negative_text), new DialContract.c.a() { // from class: com.sankuai.waimai.platform.widget.dial.presenter.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "264fcf687896a29e5574938cdcf356df", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "264fcf687896a29e5574938cdcf356df")).booleanValue();
                }
                final a aVar = a.this;
                final String str6 = str;
                final String str7 = str2;
                final String str8 = str3;
                final ArrayList arrayList2 = arrayList;
                final String str9 = str4;
                final int i2 = i;
                final String str10 = str5;
                Object[] objArr3 = {str6, str7, str8, arrayList2, str9, Integer.valueOf(i2), str10};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3d229a6516994e25f3667cb60b352535", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3d229a6516994e25f3667cb60b352535");
                    return true;
                }
                if (aVar.c != null) {
                    aVar.c.b();
                }
                DialContract.c.AbstractC1083c abstractC1083c = new DialContract.c.AbstractC1083c() { // from class: com.sankuai.waimai.platform.widget.dial.presenter.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.AbstractC1083c
                    public final boolean a(String str11, Dialog dialog) {
                        boolean matches;
                        Object[] objArr4 = {str11, dialog};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a9e67792ee4585ff964685351de0a8d7", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a9e67792ee4585ff964685351de0a8d7")).booleanValue();
                        }
                        String replace = !TextUtils.isEmpty(str11) ? str11.replace(CommonConstant.Symbol.MINUS, "") : str11;
                        a aVar2 = a.this;
                        Object[] objArr5 = {replace};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "4dab234c8ee7e2f49db73c99e48f9a33", RobustBitConfig.DEFAULT_VALUE)) {
                            matches = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "4dab234c8ee7e2f49db73c99e48f9a33")).booleanValue();
                        } else {
                            matches = replace == null ? false : Pattern.compile("^1[\\d\\*]{10}$").matcher(replace).matches();
                        }
                        if (matches) {
                            a.a(a.this, str8, arrayList2, replace, i2, false);
                            return true;
                        } else if (dialog != null && dialog.isShowing()) {
                            ae.a(dialog.getWindow().getDecorView(), ab.a(R.string.takeout_widget_filter_bar_toast_default_error_number));
                            return false;
                        } else {
                            a.this.b(ab.a(R.string.takeout_widget_filter_bar_toast_default_error_number));
                            return false;
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.AbstractC1083c
                    public final boolean b(String str11, Dialog dialog) {
                        Object[] objArr4 = {str11, dialog};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d9d34cbf4a7569de38f26dda13b47522", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d9d34cbf4a7569de38f26dda13b47522")).booleanValue();
                        }
                        a.this.a(str6, str7, str8, arrayList2, str9, i2, str10);
                        return true;
                    }
                };
                Object[] objArr4 = {abstractC1083c};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "b49b9f1df5dcd53975e1df768380759c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "b49b9f1df5dcd53975e1df768380759c");
                    return true;
                }
                String a2 = ab.a(R.string.takeout_widget_filter_bar_edit_dialog_default_title);
                String a3 = ab.a(R.string.takeout_widget_filter_bar_edit_dialog_default_message);
                String a4 = ab.a(R.string.takeout_widget_filter_bar_edit_dialog_default_positive_text);
                String a5 = ab.a(R.string.takeout_widget_filter_bar_dialog_default_negative_text);
                Object[] objArr5 = {a2, a3, a4, a5, abstractC1083c};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "bb1a87e573a9ba5d1fb09d843de08767", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "bb1a87e573a9ba5d1fb09d843de08767");
                    return true;
                } else if (aVar.b != null) {
                    aVar.b.a(a2, a3, a4, a5, abstractC1083c);
                    return true;
                } else {
                    return true;
                }
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.b
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d8def7ff275168ae23fcf632e6f6439", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d8def7ff275168ae23fcf632e6f6439")).booleanValue();
                }
                if (a.this.c != null) {
                    a.this.c.a(true, i);
                }
                a.a(a.this, str3, arrayList, str4, i, true);
                return true;
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.b
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eebc83fc8e96cded97f262a2dd0436c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eebc83fc8e96cded97f262a2dd0436c")).booleanValue();
                }
                if (a.this.c != null) {
                    a.this.c.a(false, i);
                    return true;
                }
                return true;
            }
        }, str5);
    }

    void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c33290e5829175be1e8da565f5b1aab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c33290e5829175be1e8da565f5b1aab");
        } else {
            b(ab.a(R.string.takeout_widget_filter_bar_dialog_default_title), ab.a(R.string.takeout_widget_filter_bar_dialog_default_message), str, i);
        }
    }

    void b(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561dfd514aeb7f44fbafbc18e0c66972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561dfd514aeb7f44fbafbc18e0c66972");
        } else {
            a(str, str2, str3, false, i);
        }
    }

    void a(String str, String str2, String str3, boolean z, int i) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a77bf25af41dd3667dd53cad30938f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a77bf25af41dd3667dd53cad30938f7");
        } else {
            a(str, str2, ab.a(R.string.takeout_widget_filter_bar_dialog_error_positive_text), ab.a(R.string.takeout_widget_filter_bar_dialog_default_negative_text), str3, z, i);
        }
    }

    private void a(String str, String str2, String str3, String str4, final String str5, final boolean z, final int i) {
        Object[] objArr = {str, str2, str3, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d53c499ce20d76a74d7e4cb0a884a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d53c499ce20d76a74d7e4cb0a884a2");
            return;
        }
        if (this.c != null) {
            this.c.a(z);
        }
        a((str == null || str.length() == 0) ? ab.a(R.string.takeout_widget_filter_bar_dialog_default_title) : str, (str2 == null || str2.length() == 0) ? ab.a(R.string.takeout_widget_filter_bar_dialog_default_message) : str2, (str3 == null || str3.length() == 0) ? ab.a(R.string.takeout_widget_filter_bar_dialog_default_positive_text) : str3, (str4 == null || str4.length() == 0) ? ab.a(R.string.takeout_widget_filter_bar_dialog_default_negative_text) : str4, new DialContract.c.b() { // from class: com.sankuai.waimai.platform.widget.dial.presenter.a.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.b
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06da12a7896980f4cf90d45f19b8b612", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06da12a7896980f4cf90d45f19b8b612")).booleanValue();
                }
                if (a.this.c != null) {
                    a.this.c.a(z, true, i);
                }
                a.this.a(str5);
                return true;
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c.b
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d5b38b39f0278c48c3cdf7bac380055", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d5b38b39f0278c48c3cdf7bac380055")).booleanValue();
                }
                if (a.this.c != null) {
                    a.this.c.a(z, false, i);
                    return true;
                }
                return true;
            }
        });
    }

    private void a(String str, String str2, String str3, String str4, DialContract.c.b bVar) {
        Object[] objArr = {str, str2, str3, str4, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354f456311b5ed1b9604bcb7c4ed3b16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354f456311b5ed1b9604bcb7c4ed3b16");
        } else if (this.b != null) {
            this.b.a(str, str2, str3, str4, bVar);
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5, DialContract.c.a aVar, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, aVar, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c89d59609bacfa8fefb155a28c297d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c89d59609bacfa8fefb155a28c297d1");
        } else if (this.b != null) {
            this.b.a(str, str2, str3, str4, str5, aVar, str6);
        }
    }

    void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea5c9d5fce0f3f0fa477b49323fa57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea5c9d5fce0f3f0fa477b49323fa57b");
        } else if (this.b != null) {
            this.b.b(str);
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28741ff9f6846d82040eeb6bcac6cf46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28741ff9f6846d82040eeb6bcac6cf46");
        } else if (this.b != null) {
            this.b.a(z);
        }
    }

    String a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff2687380834511417dcc0b6d6fd036", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff2687380834511417dcc0b6d6fd036");
        }
        if (list != null) {
            for (String str : list) {
                if (str != null && str.length() != 0) {
                    return str;
                }
            }
            return "";
        }
        return "";
    }
}
