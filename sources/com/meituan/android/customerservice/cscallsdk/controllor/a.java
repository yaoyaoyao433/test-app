package com.meituan.android.customerservice.cscallsdk.controllor;

import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallProto;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingCodeItems;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingItem;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.android.customerservice.callbase.bean.proto.inner.SessionsItem;
import com.meituan.android.customerservice.callbase.protohelper.b;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.cscallsdk.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final CopyOnWriteArraySet<Object> b;
    private b c;
    private f d;

    public a(f fVar, b bVar) {
        Object[] objArr = {fVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a422c8434ce737eec96b11dd6a6f2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a422c8434ce737eec96b11dd6a6f2d");
            return;
        }
        this.d = fVar;
        this.c = bVar;
        this.b = new CopyOnWriteArraySet<>();
    }

    public final void a(long j, String str, String str2, String str3, MeetingStatusItems[] meetingStatusItemsArr, MeetingItem[] meetingItemArr, MeetingItem[] meetingItemArr2, MeetingCodeItems[] meetingCodeItemsArr) {
        boolean z;
        Object[] objArr = {new Long(j), str, str2, str3, meetingStatusItemsArr, meetingItemArr, meetingItemArr2, meetingCodeItemsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69010e4abaafc8df15dd2ca7d91ab870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69010e4abaafc8df15dd2ca7d91ab870");
            return;
        }
        CallLog.log(getClass(), "CallNotify with sid= " + str + ", gid= " + j + ", legid= " + str2 + ", all members " + a(meetingStatusItemsArr) + ", leave members " + b(meetingCodeItemsArr));
        if (meetingStatusItemsArr != null) {
            z = true;
            if (meetingStatusItemsArr.length > 1) {
                z = false;
            }
        } else {
            z = true;
        }
        if (z) {
            f.c cVar = new f.c();
            cVar.a = str;
            cVar.b = j;
            cVar.c = a(meetingCodeItemsArr);
            this.d.a(cVar);
            CallLog.log(getClass(), "Send the meeting end action sid= " + cVar.a);
            return;
        }
        if (a(meetingItemArr)) {
            HashSet hashSet = new HashSet();
            for (MeetingItem meetingItem : meetingItemArr) {
                f.d dVar = new f.d();
                dVar.c = meetingItem.getAppId();
                dVar.b = meetingItem.getMber();
                dVar.d = meetingItem.getType();
                dVar.e = meetingItem.getRole();
                hashSet.add(dVar);
            }
            f.b bVar = new f.b();
            bVar.c = hashSet;
            bVar.b = j;
            bVar.a = str;
            this.d.a(bVar);
        }
        if (a(meetingItemArr2)) {
            HashSet hashSet2 = new HashSet();
            for (MeetingItem meetingItem2 : meetingItemArr2) {
                f.d dVar2 = new f.d();
                dVar2.c = meetingItem2.getAppId();
                dVar2.b = meetingItem2.getMber();
                dVar2.d = meetingItem2.getType();
                dVar2.e = meetingItem2.getRole();
                hashSet2.add(dVar2);
            }
            f.b bVar2 = new f.b();
            bVar2.c = hashSet2;
            bVar2.b = j;
            bVar2.a = str;
            this.d.b(bVar2);
        }
        if (a((MeetingItem[]) meetingCodeItemsArr)) {
            HashSet hashSet3 = new HashSet();
            for (MeetingCodeItems meetingCodeItems : meetingCodeItemsArr) {
                f.e eVar = new f.e();
                eVar.c = meetingCodeItems.getAppId();
                eVar.b = meetingCodeItems.getMber();
                eVar.g = meetingCodeItems.getCode();
                eVar.e = meetingCodeItems.getRole();
                hashSet3.add(eVar);
            }
            f.c cVar2 = new f.c();
            cVar2.c = hashSet3;
            cVar2.b = j;
            cVar2.a = str;
            this.d.b(cVar2);
        }
    }

    public final void a(String str, String str2, short s, MeetingStatusItems[] meetingStatusItemsArr, byte b) {
        Object[] objArr = {str, str2, Short.valueOf(s), meetingStatusItemsArr, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34fec24ba1ff3d8ed841ac0ec3f0798d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34fec24ba1ff3d8ed841ac0ec3f0798d");
            return;
        }
        Class<?> cls = getClass();
        CallLog.log(cls, "onCallDetectRes processDetectRsp: res = " + ((int) s) + ", sid=" + str + " type " + ((int) b));
        if (TextUtils.isEmpty(str) || b != 1 || this.b == null || this.b.size() == 0) {
            return;
        }
        Iterator<Object> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(long j, short s, SessionsItem[] sessionsItemArr) {
        Object[] objArr = {new Long(j), Short.valueOf(s), sessionsItemArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f8585f7a2f7c2f5bf3a490b8a6a41a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f8585f7a2f7c2f5bf3a490b8a6a41a1");
        } else if (this.b == null || this.b.size() == 0) {
        } else {
            Iterator<Object> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static boolean a(MeetingItem[] meetingItemArr) {
        return meetingItemArr != null && meetingItemArr.length > 0;
    }

    private Set<f.e> a(MeetingCodeItems[] meetingCodeItemsArr) {
        Object[] objArr = {meetingCodeItemsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1682a92cdcee24079090ec22d112a8fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1682a92cdcee24079090ec22d112a8fa");
        }
        HashSet hashSet = new HashSet();
        for (MeetingCodeItems meetingCodeItems : meetingCodeItemsArr) {
            f.e eVar = new f.e();
            eVar.c = meetingCodeItems.getAppId();
            eVar.b = meetingCodeItems.getMber();
            eVar.g = meetingCodeItems.getCode();
            eVar.d = meetingCodeItems.getType();
            eVar.e = meetingCodeItems.getRole();
            hashSet.add(eVar);
        }
        return hashSet;
    }

    private String a(MeetingStatusItems[] meetingStatusItemsArr) {
        Object[] objArr = {meetingStatusItemsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4888c30da839cf508bb4a3a60be8911b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4888c30da839cf508bb4a3a60be8911b");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (meetingStatusItemsArr != null && meetingStatusItemsArr.length > 0) {
            for (MeetingStatusItems meetingStatusItems : meetingStatusItemsArr) {
                sb.append(meetingStatusItems.toString());
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    private String b(MeetingCodeItems[] meetingCodeItemsArr) {
        Object[] objArr = {meetingCodeItemsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40fa09a919ff7cf075fa69ec492edf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40fa09a919ff7cf075fa69ec492edf8");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (meetingCodeItemsArr != null && meetingCodeItemsArr.length > 0) {
            for (MeetingCodeItems meetingCodeItems : meetingCodeItemsArr) {
                sb.append(meetingCodeItems.toString());
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public final void a(CSCallProto cSCallProto) {
        Object[] objArr = {cSCallProto};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b013ec9adae0b56acfa8bbe2997d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b013ec9adae0b56acfa8bbe2997d81");
        } else {
            cSCallProto.setTs(0L);
        }
    }
}
