package com.sankuai.meituan.model.datarequest.deal;

import android.text.TextUtils;
import com.google.gson.JsonDeserializer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.Deal;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DealDeserializer implements JsonDeserializer<Deal> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:117:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ com.sankuai.meituan.model.dao.Deal deserialize(com.google.gson.JsonElement r50, java.lang.reflect.Type r51, com.google.gson.JsonDeserializationContext r52) throws com.google.gson.JsonParseException {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.model.datarequest.deal.DealDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):java.lang.Object");
    }

    private static long a(String str, long j) {
        Object[] objArr = {str, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa85673c05a751d330b2d4d08a4fcb2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa85673c05a751d330b2d4d08a4fcb2c")).longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                if (TextUtils.isEmpty(trim)) {
                    return 0L;
                }
                return Long.parseLong(trim);
            } catch (Exception unused) {
            }
        }
        return 0L;
    }
}
