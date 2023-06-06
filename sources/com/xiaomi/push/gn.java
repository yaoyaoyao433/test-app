package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.xiaomi.push.gc;
import com.xiaomi.push.gh;
import com.xiaomi.push.gj;
import com.xiaomi.push.service.ag;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes6.dex */
public final class gn {
    private static XmlPullParser a;

    private static gb a(String str, String str2, XmlPullParser xmlPullParser) {
        Object a2 = gm.a().a("all", "xm:chat");
        if (a2 == null || !(a2 instanceof com.xiaomi.push.service.cf)) {
            return null;
        }
        return com.xiaomi.push.service.cf.a(xmlPullParser);
    }

    public static gi c(XmlPullParser xmlPullParser) {
        gi giVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                giVar = new gi(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return giVar;
    }

    private static String d(XmlPullParser xmlPullParser) {
        String str = "";
        int depth = xmlPullParser.getDepth();
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    private static gj e(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String str = "-1";
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                str2 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                str3 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        return new gj(Integer.parseInt(str), str2 == null ? "cancel" : str2, str3, str4, str5, arrayList);
    }

    private static String f(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && CommonConstant.File.XML.equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static gf a(XmlPullParser xmlPullParser) {
        String str;
        boolean z = false;
        String str2 = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", "s"))) {
            String attributeValue = xmlPullParser.getAttributeValue("", MessageStatisticsEntry.PARAM_CHANNEL);
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", RemoteMessageConst.TO);
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            ag.b b = com.xiaomi.push.service.ag.a().b(attributeValue, attributeValue4);
            if (b == null) {
                b = com.xiaomi.push.service.ag.a().b(attributeValue, attributeValue3);
            }
            if (b != null) {
                gf gfVar = null;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if (!"s".equals(xmlPullParser.getName())) {
                            throw new fy("error while receiving a encrypted message with wrong format");
                        }
                        if (xmlPullParser.next() != 4) {
                            throw new fy("error while receiving a encrypted message with wrong format");
                        }
                        String text = xmlPullParser.getText();
                        if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                            gd gdVar = new gd();
                            gdVar.t = attributeValue;
                            gdVar.m = true;
                            gdVar.s = attributeValue3;
                            gdVar.r = attributeValue4;
                            gdVar.q = attributeValue2;
                            gdVar.a = attributeValue5;
                            gb gbVar = new gb("s", null, null, null);
                            if (TextUtils.isEmpty(text)) {
                                gbVar.b = text;
                            } else {
                                gbVar.b = gq.a(text);
                            }
                            gdVar.a(gbVar);
                            return gdVar;
                        }
                        byte[] a2 = com.xiaomi.push.service.ap.a(com.xiaomi.push.service.ap.a(b.i, attributeValue2), text);
                        if (a == null) {
                            try {
                                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                                a = newPullParser;
                                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            } catch (XmlPullParserException e) {
                                e.printStackTrace();
                            }
                        }
                        a.setInput(new InputStreamReader(new ByteArrayInputStream(a2)));
                        a.next();
                        gfVar = a(a);
                    } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                        z = true;
                    }
                }
                if (gfVar != null) {
                    return gfVar;
                }
                throw new fy("error while receiving a encrypted message with wrong format");
            }
            throw new fy("the channel id is wrong while receiving a encrypted message");
        }
        gd gdVar2 = new gd();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        gdVar2.q = attributeValue6;
        gdVar2.r = xmlPullParser.getAttributeValue("", RemoteMessageConst.TO);
        gdVar2.s = xmlPullParser.getAttributeValue("", "from");
        gdVar2.t = xmlPullParser.getAttributeValue("", MessageStatisticsEntry.PARAM_CHANNEL);
        gdVar2.h = xmlPullParser.getAttributeValue("", "appid");
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                gdVar2.i = attributeValue7;
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                gdVar2.j = attributeValue8;
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", Constants.QuickReport.KEY_FSEQ);
            if (!TextUtils.isEmpty(attributeValue9)) {
                gdVar2.k = attributeValue9;
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                gdVar2.l = attributeValue10;
            }
        } catch (Exception unused5) {
        }
        gdVar2.g = !TextUtils.isEmpty(str) && str.equalsIgnoreCase("true");
        gdVar2.a = xmlPullParser.getAttributeValue("", "type");
        String f = f(xmlPullParser);
        if (f == null || "".equals(f.trim())) {
            gf.f();
        } else {
            gdVar2.c = f;
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    f(xmlPullParser);
                    gdVar2.d = d(xmlPullParser);
                } else if (name.equals("body")) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String d = d(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        gdVar2.e = d;
                        gdVar2.f = attributeValue11;
                    } else {
                        gdVar2.e = d;
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    gdVar2.v = e(xmlPullParser);
                } else {
                    gdVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        gdVar2.b = str2;
        return gdVar2;
    }

    public static gh b(XmlPullParser xmlPullParser) {
        gh.b bVar = gh.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = gh.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                PrintStream printStream = System.err;
                printStream.println("Found invalid presence type " + attributeValue);
            }
        }
        gh ghVar = new gh(bVar);
        ghVar.r = xmlPullParser.getAttributeValue("", RemoteMessageConst.TO);
        ghVar.s = xmlPullParser.getAttributeValue("", "from");
        ghVar.t = xmlPullParser.getAttributeValue("", MessageStatisticsEntry.PARAM_CHANNEL);
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        ghVar.q = attributeValue2;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    ghVar.a = xmlPullParser.nextText();
                } else if (name.equals("priority")) {
                    try {
                        ghVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        ghVar.a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        ghVar.b = gh.a.valueOf(nextText);
                    } catch (IllegalArgumentException unused4) {
                        PrintStream printStream2 = System.err;
                        printStream2.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals("error")) {
                    ghVar.v = e(xmlPullParser);
                } else {
                    ghVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return ghVar;
    }

    public static gc a(XmlPullParser xmlPullParser, fn fnVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", RemoteMessageConst.TO);
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", MessageStatisticsEntry.PARAM_CHANNEL);
        gc.a a2 = gc.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        gc gcVar = null;
        gj gjVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    gjVar = e(xmlPullParser);
                } else {
                    gcVar = new gc();
                    gcVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (gcVar == null) {
            if (gc.a.a == a2 || gc.a.b == a2) {
                go goVar = new go();
                goVar.q = attributeValue;
                goVar.r = attributeValue3;
                goVar.s = attributeValue2;
                goVar.a(gc.a.d);
                goVar.t = attributeValue4;
                goVar.v = new gj(gj.a.e);
                fnVar.a(goVar);
                com.xiaomi.channel.commonutils.logger.c.d("iq usage error. send packet in packet parser.");
                return null;
            }
            gcVar = new gp();
        }
        gcVar.q = attributeValue;
        gcVar.r = attributeValue2;
        gcVar.t = attributeValue4;
        gcVar.s = attributeValue3;
        gcVar.a(a2);
        gcVar.v = gjVar;
        gcVar.a(hashMap);
        return gcVar;
    }
}
