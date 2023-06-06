package com.sankuai.waimai.foundation.location.v2;

import android.text.TextUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationTypeAdapter extends TypeAdapter<WMLocation> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.gson.TypeAdapter
    public /* synthetic */ WMLocation read(JsonReader jsonReader) throws IOException {
        char c;
        char c2;
        Object[] objArr = {jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5e38d3889e8797cb21a4879179c9655", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5e38d3889e8797cb21a4879179c9655");
        }
        WMLocation wMLocation = new WMLocation("");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -2098768958:
                    if (nextName.equals("mLongitude")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1957423568:
                    if (nextName.equals("mAccuracyMeters")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -819375111:
                    if (nextName.equals("mLatitude")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -748668529:
                    if (nextName.equals("correctedWithHistoryAddress")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -590063405:
                    if (nextName.equals("mLocateDuration")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -366891650:
                    if (nextName.equals("mProvider")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -11858804:
                    if (nextName.equals("mLocationResultCode")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 136966983:
                    if (nextName.equals("hasLocatedPermission")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 413273931:
                    if (nextName.equals("mIsCache")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 861496731:
                    if (nextName.equals("mLocateSdk")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1369213417:
                    if (nextName.equals("createTime")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    wMLocation.setProvider(jsonReader.nextString());
                    break;
                case 1:
                    wMLocation.setAccuracy((float) jsonReader.nextDouble());
                    break;
                case 2:
                    wMLocation.setLatitude(jsonReader.nextDouble());
                    break;
                case 3:
                    wMLocation.setLongitude(jsonReader.nextDouble());
                    break;
                case 4:
                    LocationResultCode locationResultCode = new LocationResultCode();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -2070216145) {
                            if (hashCode == 247507199 && nextName2.equals("statusCode")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (nextName2.equals("statusMsg")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        switch (c2) {
                            case 0:
                                locationResultCode.a = jsonReader.nextInt();
                                break;
                            case 1:
                                locationResultCode.b = jsonReader.nextString();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    wMLocation.setLocationResultCode(locationResultCode);
                    break;
                case 5:
                    wMLocation.setLocationSdk(jsonReader.nextString());
                    break;
                case 6:
                    wMLocation.setLocateDuration(jsonReader.nextLong());
                    break;
                case 7:
                    wMLocation.setCreateTime(jsonReader.nextLong());
                    break;
                case '\b':
                    wMLocation.setIsCache(jsonReader.nextBoolean());
                    break;
                case '\t':
                    wMLocation.setCorrectedWithHistoryAddress(jsonReader.nextBoolean());
                    break;
                case '\n':
                    wMLocation.setHasLocatedPermission(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return wMLocation;
    }

    @Override // com.google.gson.TypeAdapter
    public /* synthetic */ void write(JsonWriter jsonWriter, WMLocation wMLocation) throws IOException {
        WMLocation wMLocation2 = wMLocation;
        Object[] objArr = {jsonWriter, wMLocation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a978991ef656da7ce6c3c98c8a90d16c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a978991ef656da7ce6c3c98c8a90d16c");
            return;
        }
        jsonWriter.beginObject();
        a(jsonWriter, "mProvider", wMLocation2.getProvider());
        jsonWriter.name("mAccuracyMeters").value(wMLocation2.getAccuracy());
        jsonWriter.name("mLatitude").value(wMLocation2.getLatitude());
        jsonWriter.name("mLongitude").value(wMLocation2.getLongitude());
        if (wMLocation2.getLocationResultCode() != null) {
            jsonWriter.name("mLocationResultCode").beginObject();
            jsonWriter.name("statusCode").value(wMLocation2.getLocationResultCode().a);
            a(jsonWriter, "statusMsg", wMLocation2.getLocationResultCode().b);
            jsonWriter.endObject();
        }
        a(jsonWriter, "mLocateSdk", wMLocation2.getLocationSDK());
        jsonWriter.name("mLocateDuration").value(wMLocation2.getLocateDuration());
        jsonWriter.name("createTime").value(wMLocation2.getCreateTime());
        jsonWriter.name("mIsCache").value(wMLocation2.isCache());
        jsonWriter.name("correctedWithHistoryAddress").value(wMLocation2.isCorrectedWithHistoryAddress());
        jsonWriter.name("hasLocatedPermission").value(wMLocation2.isHasLocatedPermission());
        jsonWriter.endObject();
    }

    private void a(JsonWriter jsonWriter, String str, String str2) throws IOException {
        Object[] objArr = {jsonWriter, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb481552999d4cd55c00970cc45c2bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb481552999d4cd55c00970cc45c2bd");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            jsonWriter.name(str).value(str2);
        }
    }
}
