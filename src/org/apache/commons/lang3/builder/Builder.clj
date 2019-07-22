(ns org.apache.commons.lang3.builder.Builder
  " The Builder interface is designed to designate a class as a builder
  object in the Builder design pattern. Builders are capable of creating and
  configuring objects or results that normally take multiple steps to construct
  or are very complex to derive.



  The builder interface defines a single method, build(), that
  classes must implement. The result of this method should be the final
  configured object or result after all building operations are performed.



  It is a recommended practice that the methods supplied to configure the
  object or result being built return a reference to this so that
  method calls can be chained together.



  Example Builder:


  class FontBuilder implements Builder<Font> {
      private Font font;

      public FontBuilder(String fontName) {
          this.font = new Font(fontName, Font.PLAIN, 12);
      }

      public FontBuilder bold() {
          this.font = this.font.deriveFont(Font.BOLD);
          return this; // Reference returned so calls can be chained
      }

      public FontBuilder size(float pointSize) {
          this.font = this.font.deriveFont(pointSize);
          return this; // Reference returned so calls can be chained
      }

      // Other Font construction methods

      public Font build() {
          return this.font;
      }
  }

  Example Builder Usage:


  Font bold14ptSansSerifFont = new FontBuilder(Font.SANS_SERIF).bold()
                                                               .size(14.0f)
                                                               .build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder Builder]))

(defn build
  "Returns a reference to the object being constructed or result being
   calculated by the builder.

  returns: the object constructed or result calculated by the builder. - `T`"
  ([^Builder this]
    (-> this (.build))))

