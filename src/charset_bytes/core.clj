(ns charset-bytes.core
  (:require [charset.core :refer [ascii utf-8 utf-16]]))

(defn get-bytes
  "Calls .getBytes() on value. The charset argument can be a
   java.nio.charset.Charset object or a String name of a charset,
   such as \"utf-8\". Returns byte[]"
  [value charset]
  (.getBytes value charset))

(defn ascii-bytes
  "Returns value encoded as an ascii byte[]"
  [value]
  (get-bytes value ascii))

(defn utf8-bytes
  "Returns value encoded as a utf-8 byte[]"
  [value]
  (get-bytes value utf-8))

(defn utf16-bytes
  "Returns value encoded as a utf-16 byte[]"
  [value]
  (get-bytes value utf-16))
