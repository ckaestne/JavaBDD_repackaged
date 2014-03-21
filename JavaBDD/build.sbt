name := "JavaBDD_repackaged"

version := "0.1"

sources in (Compile, doc) ~= (_ filter (_.getName endsWith "...."))
