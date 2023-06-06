package com.sankuai.waimai.business.im.common.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMCommonAdapter extends CommonAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        return 8;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarCornerRadius(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd071e68f65ff9715e3aaf5ef1b91c6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd071e68f65ff9715e3aaf5ef1b91c6")).intValue() : getAvatarSize(bVar) / 2;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean onTextLinkClick(View view, String str) {
        String str2;
        Uri parse;
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b00bd38a106a7ef467f7df74b09034", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b00bd38a106a7ef467f7df74b09034")).booleanValue();
        }
        if (str == null) {
            return true;
        }
        if (str.startsWith("waimaijump://")) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd5973df22d3bb2b1e697f3768ecba2c", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd5973df22d3bb2b1e697f3768ecba2c");
            } else if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
                str2 = str;
            } else if (com.sankuai.waimai.foundation.core.a.d()) {
                str2 = parse.getQueryParameter("waimai");
            } else if (com.sankuai.waimai.foundation.core.a.e()) {
                str2 = parse.getQueryParameter(AbsApiFactory.PASSPORT_ONLINE_URL);
            } else {
                str2 = com.sankuai.waimai.foundation.core.a.f() ? parse.getQueryParameter("dianping") : "";
            }
            if (!TextUtils.isEmpty(str2)) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f1f672113596446f8c94ba19f3ff32b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f1f672113596446f8c94ba19f3ff32b7");
                } else {
                    Uri parse2 = Uri.parse(str);
                    if (r.a(parse2.getQueryParameter("event_type"), 0) == 1000) {
                        JudasManualManager.a("b_waimai_tpov9gdg_mc").a("waimai_tpov9gdg").a("chat_type", parse2.getQueryParameter("chat_type")).a("source", parse2.getQueryParameter("activity_source")).a();
                    }
                }
                com.sankuai.waimai.foundation.router.a.a(view.getContext(), str2);
            }
            return true;
        } else if (str.startsWith("meituanwaimai://")) {
            com.sankuai.waimai.foundation.router.a.a(view.getContext(), str);
            return true;
        } else if (str.startsWith("imeituan://")) {
            com.sankuai.waimai.foundation.router.a.a(view.getContext(), str);
            return true;
        } else {
            Context context = this.e;
            Object[] objArr4 = {view, context};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.im.common.utils.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d17b03283301a49492e81e50eab701f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d17b03283301a49492e81e50eab701f7");
            } else if ((view.getTag() instanceof b) && "evaluateReject".equals(com.sankuai.waimai.business.im.a.a((b) view.getTag()))) {
                JudasManualManager.a(d.x, d.a, AppUtil.generatePageInfoKey(context)).a();
            }
            return super.onTextLinkClick(view, str);
        }
    }

    private int a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9b68c28f92b037395bf8f60d662cc8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9b68c28f92b037395bf8f60d662cc8")).intValue() : IMMessageAdapter.a(generalMessage);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59aaed8d50021b02de5668dd1874f610", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59aaed8d50021b02de5668dd1874f610")).intValue();
        }
        if (!IMUIManager.f() || bVar.g != 2) {
            return super.getMsgStatusTextColor(bVar);
        }
        if (bVar.i <= 0) {
            return this.e.getResources().getColor(R.color.wm_im_chat_read_color);
        }
        return this.e.getResources().getColor(R.color.wm_im_text_highlight);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getBottomSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545f60e8a8f3e6f14b30803de37832d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545f60e8a8f3e6f14b30803de37832d1")).intValue() : com.sankuai.waimai.foundation.core.a.f() ? super.getBottomSideLayout(context, bVar) : R.layout.wm_im_layout_general_bottom;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getStyle(b bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc811ae7d1814d6877c96edcbcde95a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc811ae7d1814d6877c96edcbcde95a8")).intValue();
        }
        M m = bVar.b;
        if (m instanceof GeneralMessage) {
            GeneralMessage generalMessage = (GeneralMessage) m;
            int a2 = a(generalMessage);
            if (generalMessage.getData() != null) {
                if (a2 != 200) {
                    if (a2 != 1001 && a2 != 2001) {
                        if (a2 != 2003 && a2 != 2020 && a2 != 4001) {
                            switch (a2) {
                                case 0:
                                    return generalMessage.getFromUid() == IMUIManager.a().e() ? 2 : 1;
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    switch (a2) {
                                        case 301:
                                        case 302:
                                            break;
                                        default:
                                            if (a2 != 80002 && a2 != 80003) {
                                                z = false;
                                            }
                                            if (z) {
                                                return 3;
                                            }
                                            break;
                                    }
                            }
                        }
                    } else {
                        return 1;
                    }
                }
                return 3;
            }
        }
        return super.getStyle(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b694d406cb3047ccdd534a983b0d9c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b694d406cb3047ccdd534a983b0d9c")).intValue() : bVar.g == 1 ? R.drawable.wm_comment_avatar_default_in_poi : bVar.g == 2 ? R.drawable.wm_im_avatar_default : super.getDefaultAvatarDrawableResource(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d382e4f071dfa4d94fcdc258500433", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d382e4f071dfa4d94fcdc258500433")).intValue();
        }
        M m = bVar.b;
        if (m instanceof GeneralMessage) {
            int a2 = a((GeneralMessage) m);
            if (a2 == 1 || a2 == 2 || a2 == 301 || a2 == 302 || a2 == 5 || a2 == 4001 || a2 == 4 || a2 == 1010 || a2 == 200 || a2 == 3 || a2 == 2020) {
                return 8;
            }
        } else if (bVar.b instanceof EventMessage) {
            return 8;
        }
        return super.getAvatarVisibility(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f1c29beb1f762e183d31e0c17e9adc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f1c29beb1f762e183d31e0c17e9adc")).intValue() : this.e.getResources().getColor(R.color.wm_im_text_highlight_custom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
        if (r1 != false) goto L53;
     */
    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getBackgroundResource(com.sankuai.xm.imui.session.entity.b r19) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter.getBackgroundResource(com.sankuai.xm.imui.session.entity.b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onClick(android.view.View r13, com.sankuai.xm.imui.session.entity.b r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter.a
            java.lang.String r11 = "b63134c3b60fe54eedb7eac6d07530f6"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L25:
            M extends com.sankuai.xm.im.message.bean.IMMessage r0 = r14.b
            boolean r1 = r0 instanceof com.sankuai.xm.im.message.bean.GeneralMessage
            if (r1 == 0) goto L96
            com.sankuai.xm.im.message.bean.GeneralMessage r0 = (com.sankuai.xm.im.message.bean.GeneralMessage) r0
            byte[] r1 = r0.getData()
            if (r1 == 0) goto L96
            r1 = 3
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L58
            byte[] r0 = r0.getData()     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = "utf-8"
            r3.<init>(r0, r4)     // Catch: java.lang.Exception -> L58
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L58
            r0.<init>(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = "type"
            int r3 = r0.optInt(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = "data"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Exception -> L59
            goto L5a
        L58:
            r3 = 3
        L59:
            r0 = r2
        L5a:
            if (r3 != 0) goto L96
            java.lang.String r1 = com.sankuai.waimai.business.im.utils.d.g
            com.sankuai.waimai.log.judas.JudasManualManager$a r1 = com.sankuai.waimai.log.judas.JudasManualManager.a(r1)
            java.lang.String r2 = com.sankuai.waimai.business.im.utils.d.a
            com.sankuai.waimai.log.judas.JudasManualManager$a r1 = r1.a(r2)
            r1.a()
            com.sankuai.waimai.business.im.model.d r0 = com.sankuai.waimai.business.im.model.d.a(r0)
            android.content.Context r1 = r12.e
            if (r0 == 0) goto L96
            boolean r2 = r1 instanceof com.sankuai.xm.imui.session.SessionActivity
            if (r2 == 0) goto L96
            com.sankuai.xm.imui.session.SessionActivity r1 = (com.sankuai.xm.imui.session.SessionActivity) r1
            com.sankuai.xm.imui.session.SessionFragment r13 = r1.d
            boolean r14 = r13 instanceof com.sankuai.waimai.business.im.common.message.c
            if (r14 == 0) goto L87
            com.sankuai.waimai.business.im.common.message.c r13 = (com.sankuai.waimai.business.im.common.message.c) r13
            long r0 = r0.g
            r13.a(r0)
            goto L8d
        L87:
            boolean r13 = com.sankuai.waimai.foundation.core.a.b()
            if (r13 != 0) goto L8e
        L8d:
            return r9
        L8e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "SessionFragment 未实现IGeneralMessageClickCallback接口来处理商品信息流的点击"
            r13.<init>(r14)
            throw r13
        L96:
            boolean r13 = super.onClick(r13, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter.onClick(android.view.View, com.sankuai.xm.imui.session.entity.b):boolean");
    }
}
