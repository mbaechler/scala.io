package io.scala.svgs

import com.raquo.laminar.api.L.svg.*

object Cross:
  def apply() =
    svg(
      viewBox := "0 0 24 24",
      g(
        fill := "none",
        path(
          d           := "M6 6L18 18M6 18L18 6",
          stroke      := "currentColor",
          strokeWidth := "2"
        )
      )
    )
