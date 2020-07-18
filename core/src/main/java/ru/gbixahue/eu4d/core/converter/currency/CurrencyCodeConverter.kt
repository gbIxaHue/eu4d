package ru.gbixahue.eu4d.core.converter.currency

import ru.gbixahue.eu4d.core.abstracts.Converter

/**
 * Created by Anton Zhilenkov on 04.03.2020.
 */
class CurrencyCodeConverter: Converter<String, String> {
  private val map = mutableMapOf(
    "AED" to "د.إ",
    "AFN" to "Af",
    "ALL" to "L",
    "AMD" to "Դ",
    "AOA" to "Kz",
    "ARS" to "\$",
    "AUD" to "\$",
    "AWG" to "ƒ",
    "AZN" to "ман",
    "BAM" to "КМ",
    "BBD" to "\$",
    "BDT" to "৳",
    "BGN" to "лв",
    "BHD" to "ب.د",
    "BIF" to "₣",
    "BMD" to "\$",
    "BND" to "\$",
    "BOB" to "Bs.",
    "BRL" to "R\$",
    "BSD" to "\$",
    "BWP" to "P",
    "BYR" to "Br",
    "BZD" to "\$",
    "CAD" to "\$",
    "CDF" to "₣",
    "CHF" to "₣",
    "CLP" to "\$",
    "CNY" to "¥",
    "COP" to "\$",
    "CRC" to "₡",
    "CUP" to "\$",
    "CVE" to "\$",
    "CZK" to "Kč",
    "DJF" to "₣",
    "DKK" to "kr",
    "DOP" to "\$",
    "DZD" to "د.ج",
    "EGP" to "£",
    "ERN" to "Nfk",
    "EUR" to "€",
    "FJD" to "\$",
    "FKP" to "£",
    "GBP" to "£",
    "GEL" to "ლ",
    "GHS" to "₵",
    "GIP" to "£",
    "GMD" to "D",
    "GNF" to "₣",
    "GTQ" to "Q",
    "GYD" to "\$",
    "HKD" to "\$",
    "HNL" to "L",
    "HRK" to "Kn",
    "HTG" to "G",
    "HUF" to "Ft",
    "IDR" to "Rp",
    "ILS" to "₪",
    "INR" to "₹",
    "IQD" to "ع.د",
    "IRR" to "﷼",
    "ISK" to "Kr",
    "JMD" to "\$",
    "JOD" to "د.ا",
    "JPY" to "¥",
    "KES" to "Sh",
    "KHR" to "៛",
    "KPW" to "₩",
    "KRW" to "₩",
    "KWD" to "د.ك",
    "KYD" to "\$",
    "KZT" to "〒",
    "LAK" to "₭",
    "LBP" to "ل.ل",
    "LKR" to "Rs",
    "LRD" to "\$",
    "LSL" to "L",
    "LYD" to "ل.د",
    "MAD" to "د.م.",
    "MDL" to "L",
    "MKD" to "ден",
    "MMK" to "K",
    "MNT" to "₮",
    "MOP" to "P",
    "MRO" to "UM",
    "MUR" to "₨",
    "MVR" to "ރ.",
    "MWK" to "MK",
    "MXN" to "\$",
    "MYR" to "RM",
    "MZN" to "MTn",
    "NAD" to "\$",
    "NGN" to "₦",
    "NIO" to "C\$",
    "NOK" to "kr",
    "NPR" to "₨",
    "NZD" to "\$",
    "OMR" to "ر.ع.",
    "PAB" to "B/.",
    "PEN" to "S/.",
    "PGK" to "K",
    "PHP" to "₱",
    "PKR" to "₨",
    "PLN" to "zł",
    "PYG" to "₲",
    "QAR" to "ر.ق",
    "RON" to "L",
    "RSD" to "din",
    "RUB" to "₽",
    "RWF" to "₣",
    "SAR" to "ر.س",
    "SBD" to "\$",
    "SCR" to "₨",
    "SDG" to "£",
    "SEK" to "kr",
    "SGD" to "\$",
    "SHP" to "£",
    "SLL" to "Le",
    "SOS" to "Sh",
    "SRD" to "\$",
    "STD" to "Db",
    "SYP" to "ل.س",
    "SZL" to "L",
    "THB" to "฿",
    "TJS" to "ЅМ",
    "TMT" to "m",
    "TND" to "د.ت",
    "TOP" to "T\$",
    "TRY" to "₤",
    "TTD" to "\$",
    "TWD" to "\$",
    "TZS" to "Sh",
    "UAH" to "₴",
    "UGX" to "Sh",
    "USD" to "\$",
    "UYU" to "\$",
    "VEF" to "Bs F",
    "VND" to "₫",
    "VUV" to "Vt",
    "WST" to "T",
    "XAF" to "₣",
    "XCD" to "\$",
    "XPF" to "₣",
    "YER" to "﷼",
    "ZAR" to "R",
    "ZMW" to "ZK",
    "ZWL" to "\$"
  )

  fun addCode(code: String, sign: String) {
    map[code] = sign
  }

  override fun convert(from: String): String = map[from] ?: throw NoSuchElementException()
}